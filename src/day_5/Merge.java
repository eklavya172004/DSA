package day_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Merge {
    public static void main(String[] args) {

    }

    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0],b[0]));

        List<int[]> list = new ArrayList<>(); //create a list of array of integer

        for (int[] interval: intervals){
            if(list.isEmpty() || list.get(list.size()-1)[1] < interval[0]){
                list.add(interval);
            }else{
                list.get(list.size()-1)[1] = Math.max(list.get(list.size()-1)[1],interval[1]);
            }
        }

        return list.toArray(new int[list.size()][]);

    }
}