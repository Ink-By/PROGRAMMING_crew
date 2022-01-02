package Winter2021;

import java.util.Scanner;

public class baek1120 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String [] input = a.split(" ");
        String A = input[0];
        String B = input[1];
        char [] Ainput = new char[A.length()];
        char [] Binput = new char[B.length()];
        for(int k =0;k<A.length();k++){
            Ainput[k] = A.charAt(k);
        }
        for(int k=0;k<B.length();k++){
            Binput[k] = B.charAt(k);
        }

        if(A.length()==B.length()){
            int count = 0;
            for(int i = 0;i<A.length();i++){
                if(Ainput[i]!=Binput[i]){
                    count++;
                }
            }
            System.out.println(count);
        }else{
            int ans = A.length();
            for(int i =0 ;i<=(B.length()-A.length());i++){
                int cnt = 0;
                for(int j=0;j<A.length();j++){
                    if(Ainput[j]!=Binput[i+j]){
                        cnt++;
                    }
                }
                ans = Math.min(cnt,ans);
            }
            System.out.println(ans);
        }

    }
}
