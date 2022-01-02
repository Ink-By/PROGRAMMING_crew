package Winter2021;
/* https://www.acmicpc.net/problem/10828  */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;


public class baek10828 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String [] order = new String[n];
        for(int i=0;i<n;i++){
            order[i]=sc.nextLine();
        }
        Stack<Integer> stack = new Stack<Integer>();
        for(int i=0;i<n;i++){
            if(order[i].contains("push")){
                String [] split = order[i].split(" ");
                int number = Integer.parseInt(split[1]);
                stack.push(number);
            }
            if(order[i].equals("pop")){
                if(stack.isEmpty()){
                    System.out.println(-1);
                }else{
                    System.out.println(stack.pop());
                }
            }
            if(order[i].contains("size")){
                System.out.println(stack.size());
            }
            if(order[i].contains("empty")){
                if(stack.isEmpty()){
                    System.out.println(1);
                }else{
                    System.out.println(0);
                }
            }
            if(order[i].equals("top")){
                if(stack.isEmpty()){
                    System.out.println(-1);
                }
                else{
                    int lll = stack.pop();
                    System.out.println(lll);
                    stack.push(lll);
                }
            }
        }
    }
}
