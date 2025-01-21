package day2;

public class BitSum {
    public static void main(String[] args) {
        int[] array = {2,2,3,2,7,7,7,8,8,8};
        int ans = SingleNumber(array);
        System.out.print(ans);
    }

    public static int SingleNumber(int[] nums){
        int result = 0 ;

        for (int i = 0; i < 32; i++) {
            int sum = 0;

            for (int j = 0; j < nums.length; j++) {
                sum += ( nums[j] >> i ) & 1 ;
            }

            sum %= 3;

            result |= sum << i;
        }

        return result;
    }
}
