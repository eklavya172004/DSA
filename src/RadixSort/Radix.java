package RadixSort;

import OOPs.Abstract.default_name.A;

import java.util.Arrays;

public class Radix {
    public static void main(String[] args) {
        int[] arr = {29,83,471,36,91,8};
        radixSort(arr);
    }

    public static void radixSort(int[] nums){
        int max = 0;

        for (int num:nums){
            int digits = String.valueOf(Math.abs(num)).length();
            
            if (digits>max){
                max= digits;
            }
        }

        for (int i = 1; max/i > 0;i*=10) {
            counSort(nums,i);
        }
    }

    private static void counSort(int[] nums, int i) {
        int n = nums.length;
        int[] output = new int[n];
        int[] count = new int[10];

        //storing the count of ocurrences of each digit
        for (int j = 0; j < n; j++) {
            count[(nums[j]/i)%10]++;
        }

        System.out.println(Arrays.toString(count));

        for (int j = 1; j < 10; j++) {
            count[j] += count[j-1];
        }

        System.out.println("Cummlative sum"+Arrays.toString(count));

        for (int j = n-1; j >= 0 ; j--) {
            output[count[(nums[j]/i)%10]-1] = nums[j];
            count[(nums[j]/i)%10]--;
        }

        System.out.println(Arrays.toString(output));

        for (i = 0; i < n; i++) nums[i] = output[i];

        System.out.println(Arrays.toString(nums));
    }
}
