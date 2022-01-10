package silver4;

import java.util.Scanner;
import java.util.Stack;

public class zero_10773 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int line = sc.nextInt();
        Stack<Integer> stack = new Stack<>();
        int sum = 0;

        for(int i = 0; i < line; i++){
            int a = sc.nextInt();
            if(a == 0){
                stack.pop();
            }
            else{
                stack.push(a);
            }
        }

        for(int i : stack){
            sum += i;
        }
        System.out.println(sum);
    }
}