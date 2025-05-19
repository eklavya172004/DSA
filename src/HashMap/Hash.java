package HashMap;

import java.util.HashMap;
import java.util.HashSet;

public class Hash {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("Kunal",989);
        map.put("Karan",9);
        map.put("eklavya",99);
        map.put("sharma",100);

//        System.out.println(map.get("sharma"));
//        System.out.println(map.getOrDefault("approve",90));

        HashSet<Integer> set = new HashSet<>();

        set.add(23);
        set.add(24);
        set.add(225);
        set.add(226);
        set.add(300);

        System.out.println(set);
    }
}

