package com.company;

import java.util.*;

public class N10809 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();

        int[] position = new int[26];


        for (int i = 0; i < position.length; i++){
            position[i] = -1;
        }

        for (int i = 0; i < word.length(); i++){
            char ch = word.charAt(i);

            if (position[ch - 'a'] == -1){
                position[ch - 'a'] = i;
            }
        }

        for (int i = 0; i < position.length; i++){
            System.out.print(position[i] + " ");
        }
    }
}
