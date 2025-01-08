package Practice;

//java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sum3 {
    public static void main(String[] args) {
        int[] nums = {0,0,0,0,0};
        List<List<Integer>> ans = threeSum(nums);
        System.out.println(ans);
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        List<List<Integer>> listfinal = new ArrayList<>();

        if(nums.length < 3){
            return listfinal;
        }

        int i = 0 ;


        while(i < nums.length-2){

            if(i>0 && nums[i] == nums[i-1]){
                i++;
                continue;
            }

            int j = i + 1 ;
            int k = nums.length - 1;

            while (j<k){
                int sum = nums[i]+ nums[j]+nums[k];

                if(sum == 0 ) {
                    listfinal.add(Arrays.asList(nums[i], nums[j], nums[k]));


                    while (j < k && nums[j] == nums[j + 1]) {
                        j++;
                    }

                    while (k > j && nums[k] == nums[k - 1]) {
                        k++;
//                        continue;
                    }

                    k--;
                    j++;
                } else if (sum<0) {
                    j++;
                }else{
                    k--;
                }
            }
            i++;
        }

        return listfinal;
    }
}
