package Winter2021;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Filter_Disstinct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        String [] a = input.split("");
        int [] b = new int[a.length];
        for(int i=0;i<a.length;i++){
            b[i]=Integer.parseInt(a[i]);
        }

        IntStream intStream = Arrays.stream(b);
        intStream.distinct().filter(i->i%2!=0).forEach(System.out::print);
    }
}
