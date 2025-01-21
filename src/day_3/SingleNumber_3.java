package day_3;

import java.util.Arrays;

class SingleNumber_3 {
    public static void main(String[] args) {
        int[] arr = {2,3,2,3,4,1,5,5};
        int[] ans = singleNumber(arr);
        System.out.print(Arrays.toString(ans));
    }

    public static int[] singleNumber(int[] nums) {
            int XOR = 0;

        for (int i = 0; i < nums.length; i++) {
            XOR = XOR ^ nums[i];
        }

            int rightmost = (XOR & (-XOR)) & XOR;

             int b1 = 0 ;
             int b2 = 0 ;

            for (int j = 0; j < nums.length ; j++) {
                if((nums[j] & rightmost) !=0){
                        b1 = b1^nums[j];
                }else{
                    b2 = b2^nums[j];
                }
            }
        return new int[]{b1,b2};
    }
}