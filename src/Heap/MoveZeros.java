package Heap;

import java.lang.reflect.Array;

public class MoveZeros {
    public static void swap(int[] nums){
        int zero = -1;

        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] == 0){
                zero = i;
                break;
            }
        }

        if(zero == -1) return ;

        for(int i = zero+1 ; i < nums.length ; i++){
            if(nums[i] != 0){
                int temp = nums[i];
                nums[i] = nums[zero];
                nums[zero] = temp;
                zero++;
            }
        }
    }

    public void moveZeroes(int[] nums) {
        swap(nums);
    }

    public static void main(String[] args) {
        int[] nums = {1,0,3,4,0,5,0};
        swap(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}
