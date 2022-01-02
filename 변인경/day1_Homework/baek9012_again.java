package Winter2021;

import java.io.*;
import java.util.Stack;
//https://www.acmicpc.net/problem/9012
public class baek9012_again {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int input  = Integer.parseInt(br.readLine());
        String [] save = new String[input];
        for(int i =0;i<input;i++){
            save[i]=br.readLine();
        }

        for(int i=0;i<input;i++){
            String answer ="YES";
            String [] split = save[i].split("");
            Stack <String> stack= new Stack<>();
            for(int j=0;j<split.length;j++){
                if(split[j].equals("(")){
                    stack.push("(");
                }
                else{
                    if(stack.isEmpty()){
                        answer="NO";
                    }
                    else{
                        stack.pop();
                    }
                }
            }
            if(!stack.isEmpty()){
                answer="NO";
            }
            bw.write(answer+"\n");
        }
        bw.flush();
        bw.close();
    }
}
