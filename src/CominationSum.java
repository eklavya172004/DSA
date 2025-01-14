import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class CominationSum {
    public static void main(String[] args) {
        int[] arr = {10, 1, 2, 7, 6, 1, 5};

    }
//        int ans = combinationSum2(arr,8,0);
//        System.out.print(ans);

//    public static int combinationSum2(int[] candidates, int target,int start) {
//        if(target == 0){
//            return 1;
//        }
//
//        int count  = 0 ;
//
//        for (int i = start; i < candidates.length; i++) {
//
//            if(i>start && candidates[i] == candidates[i-1] ){
//                continue;
//            }
//
//            if(target-candidates[i] >=0){
//            count += combinationSum2(candidates,target-candidates[i],i+1);
//            }
//        }
//
//        return count;
//    }

    public static void combinationSUm(int[] nums,int target,int start, List<Integer> current, List<List<Integer>> result){
        if(target == 0){
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = start; i < nums.length; i++) {
            if(i>start && nums[i] == nums[i-1]){
                continue;
            }

            if(nums[i] > target){
                break;
            }

            current.add(nums[i]);
            combinationSUm(nums,target-nums[i],i+1,current,result);
            class CominationSum2 {
                public List<List<Integer>> combinationSum2(int[] candidates, int target) {
                    List<List<Integer>> list = new ArrayList<>();
                    Arrays.sort(candidates);
                    combinationSUm(candidates,target,0,new ArrayList<>(),list);
                    return list;
                }

                public  void combinationSUm(int[] nums,int target,int start, List<Integer> current, List<List<Integer>> result){
                    if(target == 0){
                        result.add(new ArrayList<>(current));
                        return;
                    }

                    for (int i = start; i < nums.length; i++) {
                        if(i>start && nums[i] == nums[i-1]){
                            continue;
                        }

                        if(nums[i] > target){

                            break;
                        }
//                        System.out.print(Character.isL);

                        current.add(nums[i]);
                        combinationSUm(nums,target-nums[i],start+1,current,result);
                        current.remove(nums[i]);
                    }
                }

            }
        }
    }
}