package kr.ac.cnu.computer.kakaotalk_client;

import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private DBHelper dbHelper;
    private Button Button_send;
    private EditText editText;
    private MessageAdapter adapter;
    RecyclerView recyclerView;
    List<Message> messageList;

    private Handler mHandler;       //핸들러
    Socket socket;                  //클라이언트의 소켓
    final String ip ="chat.verte.kr"; //ip chopper.kim chat.verte.kr
    final int port = 8888;          //포트 넘버
    String line = "";

    OutputStream out;   //서버로 메세지 보냄
    InputStream in;     //서버로부터 메세지 받음



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // DBHelper객체를 생성하여 테이블 생성 및 데이터 가져오기
        dbHelper = new DBHelper(this, 1);

        Button_send = findViewById(R.id.sendButton);
        recyclerView = findViewById(R.id.recyclerView);
        editText = (EditText) findViewById(R.id.contentsEdit);

        messageList = dbHelper.selectAll();
        adapter = new MessageAdapter(messageList);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

        mHandler = new Handler();

        new Thread(new Runnable() {
            public void run() {

                try {
                    socket = new Socket(ip,port);

                    printClientLog("소켓연결");

                    while(true){
                        in = socket.getInputStream();

                        byte[] buffer = new byte[2045];
                        int size = -1;

                        if ((size=in.read(buffer)) !=-1) {
                            line = new String(buffer,0,size);

                            print(line);


                        }

                    }


                }catch (Exception ex){
                    ex.printStackTrace();
                }


            }
        }).start();

        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                Button_send.setEnabled(false);
            }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String none = editText.getText().toString();
                if(none.equals("")){
                    Button_send.setEnabled(false);
                }
                else{
                    Button_send.setEnabled(true);
                }
            }
            @Override
            public void afterTextChanged(Editable s) {
                String none = editText.getText().toString();
                if(none.equals("")){
                    Button_send.setEnabled(false);
                }
                else{
                    Button_send.setEnabled(true);
                }
            }
        });
    }

    /*
        전송 버튼을 누를 때 동작 되는 메소드
        이 메소드 내용 작성
    */
    public void sendAction(View view) {


        String msg = editText.getText().toString();

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    out = socket.getOutputStream();//데이터 보내기
                    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(out));

                    bw.write(msg);
                    bw.flush();
                    printClientLog(msg+" : 서버로 데이터 전송완료");

                }catch (Exception ex){
                    ex.printStackTrace();
                }

            }
        }).start();

        Message message = dbHelper.selectOne(dbHelper.insert( msg , kr.ac.cnu.computer.homework13.MessageType.RIGHT_CONTENTS));//message 리턴
        messageList.add(message);
        adapter.notifyDataSetChanged();
        editText.setText("");
        Button_send.setEnabled(false);


    }


    public void print(String data) {
        Log.d("ClientGetMessage", "받은 데이터 : "+data);
        mHandler.post(new Runnable() {
            @Override
            public void run() {
                Message message1 = dbHelper.selectOne(dbHelper.insert( data , kr.ac.cnu.computer.homework13.MessageType.LEFT_CONTENTS));//message 리턴
                messageList.add(message1);
                adapter.notifyDataSetChanged();
            }
        });
    }

    public void printClientLog(final String data) {
        Log.d("ClientCheck", data);
    }

}