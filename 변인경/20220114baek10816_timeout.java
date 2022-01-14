package Winter2021;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class baek10816_timeout {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cardHow = Integer.parseInt(br.readLine());
        String cc = br.readLine();
        int [] Card = new int[cardHow];
        String [] split = cc.split(" ");
        for(int i=0;i<cardHow;i++){
            Card[i]=Integer.parseInt(split[i]);
        }
        int player = Integer.parseInt(br.readLine());
        String cc2 = br.readLine();
        String [] split2 = cc2.split(" ");
        int [] playerCard = new int[player];
        for(int i=0;i<playerCard.length;i++){
            playerCard[i] = Integer.parseInt(split2[i]);
        }

        HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();

        for(int i=0;i<cardHow;i++){
            int key = Card[i];
            map.put(key, map.getOrDefault(key,0)+1);
        }
        StringBuilder builder = new StringBuilder();

        for(int i=0;i<player;i++){
            int key = playerCard[i];
            builder.append(map.getOrDefault(key,0)).append(' ');
        }
        System.out.println(builder);

    }
}
