package silver5;
import java.util.*;
import java.io.*;

public class divisor_1037_0127 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));

        int size = Integer.parseInt(br.readLine());
        int[] num = new int[size];
        String[] str = br.readLine().split(" ");

        for(int i = 0; i < size; i++){
            num[i] = Integer.parseInt(str[i]);
        }

        Arrays.sort(num);

        int min = num[0];
        int max = num[size-1];

        wr.append(min * max + "\n");
        wr.flush();

        /* Scanner를 사용한 방법
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] num = new int[N];

        for(int i = 0; i < N; i++){
            num[i] = sc.nextInt();
        }

        Arrays.sort(num);

        int min = num[0];
        int max = num[N-1];

        System.out.println(min * max);

         */
    }
}
