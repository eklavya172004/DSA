import java.lang.reflect.Array;
import java.util.Arrays;

public class MaxDiff {
        public static int maximumGap(int[] nums) {
            Arrays.sort(nums);

            int diff = 0;

            for (int i = 0; i < nums.length; i++) {
                if(i>0){
                    int cd = nums[i] - nums[i-1];

                    if(cd>diff){
                        diff = cd;
                    }
                }
            }

            return diff;
        }

    public static void main(String[] args) {
        int[] arr = {10};
        int diff = maximumGap(arr);
        System.out.println(diff);
    }

}
