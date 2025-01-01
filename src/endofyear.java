public class endofyear {
    public static void main(String[] args) {
        int[] nums = {1,1,2};
        int ans = removeDuplicates(nums);
        System.out.print(ans);
    }


        public static int removeDuplicates(int[] nums) {
            int k = 1;

            for(int i = 1 ; i < nums.length; i++){
                if(nums[i-1] != nums[i]){
                    k++;
                }
            }
            return k;
        }

}
