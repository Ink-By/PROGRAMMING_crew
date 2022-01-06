package com.company;
import java.util.*;
import java.util.stream.IntStream;

public class ink {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        char[] str = sc.nextLine().toCharArray();
        int[] ints = new int[str.length];

        for (int i=0; i<str.length; i++){
            ints[i] = Integer.parseInt(String.valueOf(str[i]));
        }
        IntStream intStream = IntStream.of(ints);
        intStream.filter(i -> i%2 != 0).distinct().forEach(System.out::print);
    }
}
