package day_4;

import java.util.ArrayList;
import java.util.List;

class NumTilePossibilities {

    public static void main(String[] args) {
        int[] arr = {1,1,2};
        List<List<Integer>> list = permute(arr);
        System.out.print(list);
    }

//    public static int numTilePossibilities(String tiles) {
//
//    }

//    class Solution {
//        public static List<List<Integer>> permutation(ArrayList<Integer> p,int[] up) {
//            List<List<Integer>> list = new ArrayList<>();
//
//            if(up.length == 0){
//                list.add(new ArrayList<>(p));
//                return list;
//            }
//
//            int current = up[0];
//
//            for (int i = 0; i <= p.size(); i++) {
//                ArrayList<Integer> f = new ArrayList<>(p.subList(0,i));
//                ArrayList<Integer> s = new ArrayList<>(p.subList(i,p.size()));
//
//                f.add(current);
//                f.addAll(s);
//
//                int[] newup = new int[up.length-1];
//                System.arraycopy(up,1,newup,0,up.length-1);
//
////                ArrayList<Integer> newup = new ArrayList<>(up.subList(1,up.size()));
//                List<List<Integer>> answerfrombelow = permutation(f,newup);
//                list.addAll(answerfrombelow);
//            }
//            return list;
//        }
public static List<List<Integer>> permute(int[] nums) {
    List<List<Integer>> result = new ArrayList<>();
    boolean[] used = new boolean[nums.length];
    backtrackduplicate(nums, new ArrayList<>(), result,used);
    return result;
}

    private static void backtrack(int[] nums, List<Integer> current, List<List<Integer>> result) {
        // Base case: If the current list size matches the length of nums, add it to the result
        if (current.size() == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        // Iterate through all indices of nums
        for (int i = 0; i < nums.length; i++) {
            // Check if nums[i] is already in the current list
            if (current.contains(nums[i])) {
                continue; // Skip already used numbers
            }

            // Add the current number to the permutation
            current.add(nums[i]);

            // Recur with the updated permutation
            backtrack(nums, current, result);

            // Backtrack: Remove the last added number
            current.remove(current.size() - 1);
        }
    }

    private static void backtrackduplicate(int[] nums, List<Integer> current, List<List<Integer>> result,boolean[] used) {
        // Base case: If the current list size matches the length of nums, add it to the result
        if (current.size() == nums.length ) {
            result.add(new ArrayList<>(current));
            return;
        }

        // Iterate through all indices of nums
        for (int i = 0; i < nums.length; i++) {
            if(i>0 && nums[i] == nums[i-1] && !used[i-1]){
                continue;
            }

            if(used[i]){
                continue;
            }


            // Add the current number to the permutation
            current.add(nums[i]);
            used[i] = true;

            // Recur with the updated permutation
            backtrackduplicate(nums, current, result,used);

            // Backtrack: Remove the last added number
            current.remove(current.size() - 1);
            used[i] = false;
        }
    }
}