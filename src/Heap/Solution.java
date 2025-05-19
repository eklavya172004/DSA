package Heap;

import java.util.*;

public class Solution {
    public static int solve(ArrayList<Integer> A) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.addAll(A);
        
        int sum = 0 ;
        
        while (pq.size()>1){
            int first = pq.poll();
            int second = pq.poll();

                    int cost = first+second;
                    sum += cost;

                    pq.add(cost);
        }

        return sum;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        int a  = solve(list);
        System.out.println(a);
    }


    public String frequencySort(String s) {
        HashMap<Character,Integer> map = new HashMap<>();

        for(int i = 0 ; i < s.length() ; i++){
            char c = s.charAt(i);
            map.put(c,map.getOrDefault(s.charAt(i),0)+1);
        }

        StringBuilder p = new StringBuilder();

        while(!map.isEmpty()){
             int max = 0;
             char key =  0;

             for (Map.Entry<Character,Integer> entry:map.entrySet()){
                 if (entry.getValue()>max){
                     max = entry.getValue();
                     key = entry.getKey();
                 }
             }

            for (int i = 0; i < max; i++) {
                p.append(key);
            }

            map.remove(key);
        }
        return p.toString();
//        2nd approach

//   HashMap<Character,Integer> map = new HashMap<>();
//
//        StringBuilder p = new StringBuilder();
//
//
//            for(int i = 0 ; i < s.length() ; i++){
//             char c = s.charAt(i);
//             map.put(c,map.getOrDefault(s.charAt(i),0)+1);
//            }
//
//            PriorityQueue<Character> maxHeap = new PriorityQueue<>(
//            (a, b) -> map.get(b) - map.get(a)
//            );
//            maxHeap.addAll(map.keySet());
//
//            while(!map.isEmpty()){
//                char c = maxHeap.poll();
//                int count = map.get(c);
//
//                for(int i = 0 ; i  < count ; i++){
//                    p.append(c);
//                }
//
//                map.remove(c);
//            }
//
//            return p.toString();
    }

}