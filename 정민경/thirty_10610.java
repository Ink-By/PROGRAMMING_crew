package silver5;
import java.util.*;

public class thirty_10610 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String N = sc.next();
        String[] num = N.split("");
        int a = num.length;
        int[] number = new int[a];
        int sum = 0;

        for(int i = 0; i < num.length; i++){
            number[i] = Integer.parseInt(num[i]);
            sum += number[i];
        }

        Arrays.sort(number);
        if(sum % 3 == 0 && N.contains("0")){
            for(int i = a-1; i >= 0; i--) {
                System.out.print(number[i]);
            }
        }
        else{
            System.out.println(-1);
        }
    }
}
