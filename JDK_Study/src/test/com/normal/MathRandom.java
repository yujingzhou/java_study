package test.com.normal;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class MathRandom {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Random random = new Random();
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0;i<100;i++){
            int temp = random.nextInt(10);
            Integer t = Integer.valueOf(temp);
            if(map.containsKey(t)){
                map.put(t, map.get(t)+1);
            }else{
                map.put(temp, 1);
            }
        }
        
        for (int i=0;i <10; i++) {
            System.out.println(map.get(i));
        }
    }

}
