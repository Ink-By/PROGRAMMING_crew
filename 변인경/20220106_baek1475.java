package Winter2021;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baek1475_again {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String [] split = input.split("");
        int [] number = new int[split.length];
        int [] save = new int[9];

        for(int i=0;i<input.length();i++){
            number[i]=Integer.parseInt(split[i]);
            if(number[i]==9){
                number[i]=6;
            }
            save[number[i]]++;
        }
        //0~8
        if(save[6]%2==0){
            save[6] = save[6]/2;
        }
        else{
            save[6] = (save[6]/2)+1;
        }
        int max = 0;
        for(int i=0;i<9;i++){
            if(max<=save[i]){
                max = save[i];
            }
        }
        System.out.println(max);

    }
}
