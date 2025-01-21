package day_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets {
    public static void main(String[] args) {
        int[] arr = {1,2,2};

        List<List<Integer>> list = subset(arr);
        System.out.println(list);
    }

    private static List<List<Integer>> subset(int[] arr){
        List<List<Integer>> list = new ArrayList<>();

        list.add(new ArrayList<>());
        int start = 0 ;
        int end= 0 ;

        for (int i = 0; i < arr.length; i++) {
            int size = list.size();

            if(i>0 && arr[i-1] == arr[i]){
                start = end + 1;
            }

            end = size - 1;

            for (int j = start; j < size; j++) {
                ArrayList<Integer> inner = new ArrayList<>(list.get(j));
                inner.add(arr[i]);
                list.add(inner);
            }
        }
    return list;
    }
}
