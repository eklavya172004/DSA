package HashMap;

import java.util.ArrayList;

public class KfreqElements {
    public void topKFrequent(int[] nums, int k) {
        if (nums.length<=1){
            return ;
        }

        int max = nums[0];
        for (int num: nums) {
            if (num>max){
                max = num;
            }
        }

        int[] freq = new int[max+1];

        for (int i = 0; i < nums.length; i++) {
            freq[nums[i]] += 1;
        }

//        ArrayList<Integer> list = new ArrayList<>();

    }
}
