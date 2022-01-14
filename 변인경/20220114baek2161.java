import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class baek2161 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();
        for(int i=0;i<input;i++){
            queue.offer(i+1);
        }
        List <Integer>list = new ArrayList<>();
        while(!queue.isEmpty()){
            list.add(queue.poll());
            if(queue.isEmpty()){
                break;
            }
            queue.offer(queue.poll());

        }
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }

    }
}
