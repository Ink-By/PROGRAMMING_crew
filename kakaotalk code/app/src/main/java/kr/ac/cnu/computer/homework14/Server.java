package kr.ac.cnu.computer.homework14;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server extends Thread {

    final static int SERVER_PORT =8888;
    final static String SERVER_MESSAGE ="연결 성공";

    public static void main(String[] args) {
        ServerSocket serverSocket =null;
        try {
            serverSocket =new ServerSocket(SERVER_PORT);
        }catch (IOException e) {
            e.printStackTrace();
        }
        try {
            while (true) {
                System.out.println("socket 연결 대기");
                Socket socket = serverSocket.accept();
                System.out.println("host : "+socket.getInetAddress()+" | 연결 성공");
                InputStream is = socket.getInputStream();
                OutputStream os = socket.getOutputStream();

                byte[] data =new byte[256];
                int n = is.read(data);
                final String message =new String(data,0,n);

                System.out.println(message);
                os.write( SERVER_MESSAGE.getBytes() );
                os.flush();
                is.close();
                os.close();
                socket.close();
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
