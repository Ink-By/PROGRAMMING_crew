package kr.ac.cnu.computer.calculator;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    int flag =0;
    String a ="";
    String b = "";
    int result = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView textView = (TextView)findViewById(R.id.process);
        TextView textView2 = (TextView)findViewById(R.id.resultbt);

        textView2.setText("0");

        Button onebutton = (Button) findViewById(R.id.one);
        onebutton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                if(flag==0){
                    a+="1";
                    textView.append("1");
                }
                else{
                    b+="1";
                    textView.append("1");

                }
            }
        });

        Button twobutton = (Button) findViewById(R.id.two);
        twobutton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                if(flag==0){
                    a+="2";
                    textView.append("2");
                }
                else{
                    b+="2";
                    textView.append("2");

                }
            }
        });

        Button threebutton = (Button) findViewById(R.id.three);
        threebutton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                if(flag==0){
                    a+="3";
                    textView.append("3");
                }
                else{
                    b+="3";
                    textView.append("3");

                }
            }
        });

        Button fourbutton = (Button) findViewById(R.id.four);
        fourbutton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                if(flag==0){
                    a+="4";
                    textView.append("4");
                }
                else{
                    b+="4";
                    textView.append("4");

                }
            }
        });

        Button fivebutton = (Button) findViewById(R.id.five);
        fivebutton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                if(flag==0){
                    a+="5";
                    textView.append("5");
                }
                else{
                    b+="5";
                    textView.append("5");

                }
            }
        });

        Button sixbutton = (Button) findViewById(R.id.six);
        sixbutton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                if(flag==0){
                    a+="6";
                    textView.append("6");
                }
                else{
                    b+="6";
                    textView.append("6");

                }
            }
        });


        Button sevenbutton = (Button) findViewById(R.id.seven);
        sevenbutton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                if(flag==0){
                    a+="7";
                    textView.append("7");
                }
                else{
                    b+="7";
                    textView.append("7");

                }
            }
        });

        Button eightbutton = (Button) findViewById(R.id.eight);
        eightbutton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                if(flag==0){
                    a+="8";
                    textView.append("8");
                }
                else{
                    b+="8";
                    textView.append("8");


                }
            }
        });

        Button ninebutton = (Button) findViewById(R.id.nine);
        ninebutton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                if(flag==0){
                    a+="9";
                    textView.append("9");
                }
                else{
                    b+="9";
                    textView.append("9");


                }
            }
        });

        Button zerobutton = (Button) findViewById(R.id.zero);
        zerobutton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                if(flag==0){
                    a+="0";
                    textView.append("0");
                }
                else{
                    b+="0";
                    textView.append("0");


                }
            }
        });
        Button clearbutton = (Button) findViewById(R.id.clear);
        clearbutton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                result = 0;
                a="0";
                b="0";
                flag = 0;
                textView.setText("");
                textView2.setText("0");
            }
        });

        Button plusbutton = (Button) findViewById(R.id.plus);
        plusbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag ==0){
                    flag = 1;
                    textView.append("+");
                }
                else if(flag ==1){
                    textView.append("+");
                    result = Integer.parseInt(a)+Integer.parseInt(b);
                    a = Integer.toString(result);
                    b = "0";
                    textView2.setText(a);


                }

            }
        });


        Button equalbutton = (Button) findViewById(R.id.equal);
        equalbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result = Integer.parseInt(a)+Integer.parseInt(b);

                textView.setText("");
                textView2.setText(Integer.toString(result));

            }
        });


    }

}