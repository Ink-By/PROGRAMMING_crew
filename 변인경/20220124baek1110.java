package Winter2021_Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baek1110 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());

        int result = input;
        int count = 0;

        do {
            count++;
            input = (((input%10)*10)+((input/10)+(input%10))%10);

        }while(result != input);

        System.out.println(count);
    }
}
