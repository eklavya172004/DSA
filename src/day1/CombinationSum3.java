package day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum3 {
    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,5,6,7,8,9};
        int k = 3;

        List<List<Integer>> list2 = new ArrayList<>();

        List<List<Integer>> list = count(1,6,new ArrayList<>(),list2,k);
        System.out.print(list);
    }

    public static List<List<Integer>> count(int start, int target,ArrayList<Integer> current,List<List<Integer>> result,int k){
//        List<List<Integer>> list = new ArrayList<>();

        if(target == 0 && k==0){
            result.add(new ArrayList<>(current));
        }

        for (int i = start; i<=9 && i <= target ; i++) {
//        while (start < target) {
//            if(target - i >=0){
            current.add(i);
            count(i+1,target-i,current,result,k-1);
            current.remove(current.size()-1);
//            }

        }

        return result;
}

}
