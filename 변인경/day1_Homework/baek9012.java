package Winter2021;

import java.io.*;
import java.util.Scanner;
import java.util.Stack;

public class baek9012 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        String [] input = new String[n];
        for (int i=0;i<n;i++){

            input[i]=br.readLine();
        }
        int j = n;
        while(j>0){
            String answer = "Yes";
            Stack < String>stack = new Stack<>();
            for(int i=0;i<n;i++){
                String [] one = input[i].split("");
                for (String s : one) {
                    if (s.equals("(")) {
                        stack.push("(");

                    } else {
                        if (stack.isEmpty()) {
                            answer = "NO";
                        } else {
                            stack.pop();
                        }
                    }
                }
                if(!stack.isEmpty()){
                    answer="NO";
                }

            }
            bw.write(answer+"\n");
            j--;
        }
        bw.flush();
        bw.close();
        /*int i = 0;
        while(i==n){
            String data = br.readLine();
            Stack stack = new Stack();
            boolean finish = false;
            for(int j =0;j<data.length();j++){
                char c = data.charAt(j);
                if(c=='('){
                    stack.push(c);
                }else{
                    if(stack.isEmpty()){
                        finish =true;
                        break;
                    }else{
                        stack.pop();
                    }
                }
            }
            if(!stack.isEmpty() || finish){
                System.out.println("NO");
            }else{
                System.out.println("YES");
            }
            i++;

        }*/

    }
}
