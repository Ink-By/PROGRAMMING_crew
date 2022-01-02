package Winter2021;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class baek10845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> queue = new LinkedList<>();
        int input = Integer.parseInt(br.readLine());
        String [] k = new String[input];
        for(int i=0;i<input;i++){
            k[i]=br.readLine();
        }
        for(int i=0;i<input;i++){
            if(k[i].contains("push")){
                String[] split = k[i].split(" ");
                queue.offer(Integer.parseInt(split[1]));
            }
            if(k[i].equals("front")){
                if(queue.isEmpty()){
                    System.out.println(-1);
                }else{
                    int [] saving = new int[queue.size()];
                    for(int j=0;j<queue.size();j++){

                        saving[j]=queue.poll();
                        //System.out.println("front의 saving 상태 : "+saving[j]);
                        queue.offer(saving[j]);
                    }
                    System.out.println(saving[0]);

                }
            }
            if(k[i].equals("back")){
                if(queue.isEmpty()){
                    System.out.println(-1);
                }else{
                    int [] saving1 = new int[queue.size()];
                    for(int j=0;j<queue.size();j++){

                        saving1[j]=queue.poll();
                        //System.out.println("back의 saving 상태 : "+saving1[j]);
                        queue.offer(saving1[j]);

                    }
                    System.out.println(saving1[saving1.length-1]);
                }
            }
            if(k[i].equals("pop")){
                if(queue.isEmpty()){
                    System.out.println(-1);
                }else{
                    System.out.println(queue.poll());
                }
            }if(k[i].equals("empty")){
                if(queue.isEmpty()){
                    System.out.println(1);
                }else{
                    System.out.println(0);
                }
            }if(k[i].equals("size")){
                System.out.println(queue.size());
            }
        }
    }
}
