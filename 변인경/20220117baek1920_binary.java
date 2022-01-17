package Winter2021;

import java.util.Arrays;
import java.util.Scanner;

public class baek1920_binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        int [] list1 = new int[first];
        for(int i=0;i<first;i++){
            list1[i] = sc.nextInt();
        }
        Arrays.sort(list1);
        int second = sc.nextInt();
        for(int i=0;i<second;i++){
            int num = sc.nextInt();
            int left = 0;
            int right = list1.length-1;
            boolean flag=false;
            while (left<=right){
                int mid = (left+right)/2;
                int middleValue = list1[mid];
                if(middleValue>num){
                    right = mid-1;

                }else if(middleValue<num){
                    left=mid+1;
                }else{
                    flag = true;
                    System.out.println(1);
                    break;
                }
            }
            if(!flag){
                System.out.println(0);
            }
        }
    }
}
