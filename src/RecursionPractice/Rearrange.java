package RecursionPractice;

import java.util.Arrays;

class Rearrange{
    public static void main(String[] args) {
        int[] arr = {28, -41, 22, -8, -37, 46, 35, -9, 18, -6, 19, -26, -37, -10, -9, 15, 14, 31
};
        System.out.print(Arrays.toString(rearrangeArray(arr)));
    }

//    public static int[] rearrangeArray(int[] nums) {
//        int n = nums.length;
//        int p1 = 0; //even
//        int p2 = 1; //odd
//
//        while(p1<n && p2<n){
//
//            while (p1<n && nums[p1]>0){
//                    p1 += 2;
//            }
//
//            while (p2<n && nums[p2]<0){
//                p2 += 2;
//            }
//
//            if(p1<n && p2<n){
//                int temp = nums[p1];
//                nums[p1] = nums[p2];
//                nums[p2] = temp;
//            }
//
//        }
//
//        return nums;
//    }
    public static int[] rearrangeArray(int[] nums){
        int n = nums.length;
//        int[] result = new int[n];
        int even = 0;
        int odd = 1;

        for(int i = 0 ; i < n ; i++){
            if(nums[i]>0 && even < n){
                nums[even] = nums[i];
                even += 2;
            }
        }

        for(int i = 0 ; i < n ; i++){
            if(nums[i]<0 && odd<n){
                nums[odd] = nums[i];
                odd += 2;
            }
        }

        return nums;
    }
}