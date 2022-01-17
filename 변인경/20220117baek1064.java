package Winter2021;

import java.util.Scanner;

public class baek1064 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double [] input = new Double[6];
        for(int i=0;i< input.length;i++){
            input[i]=sc.nextDouble();
        }
        Double Ax = input[0];
        Double Ay = input[1];
        Double Bx = input[2];
        Double By = input[3];
        Double Cx = input[4];
        Double Cy = input[5];

        if((By-Ay)*(Cx-Bx)==(Bx-Ax)*(Cy-By)){
            System.out.println(-1.0);
        }
        //A 기준
        else{
            Double Ba = Math.pow(Bx-Ax,2);
            Double Bb = Math.pow(By-Ay,2);
            Double AB = Math.sqrt(Ba+Bb);

            Double Ca = Math.pow(Cx-Ax,2);
            Double Cb = Math.pow(Cy-Ay,2);
            Double AC = Math.sqrt(Ca+Cb);

            Double a = Math.pow(Bx-Cx,2);
            Double b = Math.pow(By-Cy,2);
            Double BC = Math.sqrt(a+b);

            Double [] length = new Double[3];
            length[0] = 2 *(AB+AC);
            length[1] = 2 *(AB+BC);
            length[2] = 2 *(AC+BC);

            Double min = Double.MAX_VALUE;
            Double max = Double.MIN_VALUE;
            for(int i=0;i<3;i++){
                if(min> length[i]){
                    min = length[i];
                }
                if(max<length[i]){
                    max = length[i];
                }
            }
            System.out.println(max-min);
        }



    }
}
