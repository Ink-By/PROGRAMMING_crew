import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
//https://www.acmicpc.net/problem/10773
public class baek10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        int []number = new int[input];
        for(int i=0;i<input;i++){
            number[i]=Integer.parseInt(br.readLine());
        }
        for(int i=0;i<input ;i++){
            if(number[i]>0){
                stack.push(number[i]);

            }
            else{
                stack.pop();

            }
        }
        int sum =0;
        for(Integer i : stack){
            sum +=i;
        }
        System.out.println(sum);
    }
}
