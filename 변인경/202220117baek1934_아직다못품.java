package Winter2021;

import java.util.Scanner;

public class baek1934 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.nextLine());
        String [] arr = new String[a];
        for(int i=0;i<a;i++){
            arr[i]=sc.nextLine();
            String [] split = arr[i].split(" ");
            int x = Integer.parseInt(split[0]);
            int y = Integer.parseInt(split[1]);

            int save = 0;
            int k=1;
            
            System.out.println(save);
        }
    }
}
