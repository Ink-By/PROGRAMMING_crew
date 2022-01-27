package silver4;

import java.io.*;
import java.util.Stack;

public class stack_10828_0127 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter wr = new BufferedWriter((new OutputStreamWriter(System.out)));

        int N = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < N; i++){
            String[] str = br.readLine().split(" ");
            String command = str[0];

            if(command.equals("push")){
                stack.push(Integer.parseInt(str[1]));
            }
            else if(command.equals("pop")){
                if(stack.empty()){
                    wr.append(-1 + "\n");
                }
                else{
                    wr.append(stack.pop() + "\n");
                }
            }
            else if(command.equals("size")){
                wr.append(stack.size() + "\n");
            }
            else if(command.equals("empty")){
                if(stack.empty()){
                    wr.append(1 + "\n");
                }
                else{
                    wr.append(0 + "\n");
                }
            }
            else if(command.equals("top")){
                if(stack.empty()){
                    wr.append(-1 + "\n");
                }
                else{
                    wr.append(stack.peek() + "\n");
                }
            }
            wr.flush();
        }
    }
}
