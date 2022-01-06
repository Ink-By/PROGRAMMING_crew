package com.company;

import java.util.*;

public class N2908 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        String[] pro = input.split(" ");

        char[] A = pro[0].toCharArray();
        char[] B = pro[1].toCharArray();

        String a = "";
        String b = "";

        for (int i = A.length -1; i >= 0; i--){
            a += A[i];
            b += B[i];
        }

        int reA = Integer.parseInt(a);
        int reB = Integer.parseInt(b);

        if (reA < reB){
            System.out.print(reB);
        }else{
            System.out.print(reA);
        }
    }
}
