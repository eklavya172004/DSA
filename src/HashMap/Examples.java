package HashMap;

import java.util.HashMap;
import java.util.Map;

public class Examples {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 2, 3, 3, 3, 4, 5, 5, 5, 5};

        Map<Integer,Integer> freq = new HashMap<>();

        for (int num : numbers) {
            freq.put(num,freq.getOrDefault(num,0)+1);
        }

        for(Map.Entry<Integer,Integer> entry : freq.entrySet()){
            System.out.println("number " + entry.getKey() + " appears " + entry.getValue() + " times");
        }
    }
}
