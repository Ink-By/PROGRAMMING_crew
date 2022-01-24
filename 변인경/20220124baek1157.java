package Winter2021_Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baek1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] count = new int[26];
        //65 90대
        //97 122소
        String input = br.readLine();

        for (int i = 0; i < input.length(); i++) {
            char a = input.charAt(i);
            if (a >= 97) {
                count[a - 97]++;
            } else {
                count[a - 65]++;
            }
        }
        //List <Integer>list = new LinkedList<>();
        int max = Integer.MIN_VALUE;
        int save = 0;
        boolean flag = false;
        /*for(int i=0;i<count.length;i++){
            list.add(count[i]);
        }*/
        char result = 0;
        for (int i = 0; i < count.length; i++) {
            if (max < count[i]) {
                max = count[i];
                save = i;
                result = (char) (save + 65);
            } else if (max == count[i]) {

                result ='?';

            }
        }

        System.out.println(result);


    }
}
