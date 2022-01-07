package Winter2021;

import java.util.Scanner;

public class baek2581_sosu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = 0;
        while(a==b){
            int k = a;
            for(int i = 2;i<k;i++){
                if(a%i==0){
                    break;
                }
            }

            a++;
        }
    }
}
