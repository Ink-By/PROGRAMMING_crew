package silver4;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class jeop_mi_sa_11656_0114 {
    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int length = str.length();
        String[] result = new String[length];
        for(int i = 0; i < length; i++) {
            result[i] = str.substring(i);
        }

        Arrays.sort(result);

        for(int i = 0; i < length; i++) {
            System.out.println(result[i]);
        }
    }
}
