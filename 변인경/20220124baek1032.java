package Winter2021_Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baek1032 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());
        String [] arr = new String[k];
        for(int i=0;i<k;i++){
            arr[i]=br.readLine();
        }
        String [] save = arr[0].split("");
        for(int i=1;i<k;i++){
            String [] figure = arr[i].split("");
            for(int j=0;j< save.length;j++){
                if(!save[j].equals(figure[j])){
                    save[j]="?";
                }
            }
        }
        for(int i=0;i< save.length;i++){
            System.out.print(save[i]);
        }
    }
}
