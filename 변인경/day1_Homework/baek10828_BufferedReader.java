package Winter2021;
//시간초과 떄문에 다시 함
//https://www.acmicpc.net/problem/10828
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class baek10828_BufferedReader {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> st = new Stack<Integer>();
        int input = Integer.parseInt(br.readLine());
        String [] order = new String[input];
        for(int i=0;i<input;i++){
            order[i]= br.readLine();
        }
        for(int i=0;i<input;i++){
            if(order[i].contains("push")){
                String [] split = order[i].split(" ");
                int number = Integer.parseInt(split[1]);
                st.push(number);
            }
            if(order[i].equals("pop")){
                if(st.isEmpty()){
                    System.out.println(-1);
                }else{
                    System.out.println(st.pop());
                }
            }
            if(order[i].contains("size")){
                System.out.println(st.size());
            }
            if(order[i].contains("empty")){
                if(st.isEmpty()){
                    System.out.println(1);
                }else{
                    System.out.println(0);
                }
            }
            if(order[i].equals("top")){
                if(st.isEmpty()){
                    System.out.println(-1);
                }
                else{
                    int lll = st.pop();
                    System.out.println(lll);
                    st.push(lll);
                }
            }
        }
    }
}
