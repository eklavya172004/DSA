public class SplitArray {
    public static void main(String[] args) {

    }

    public int spiltArray(int[] nums,int m){
            int start = 0;
            int end = nums.length - 1;

            for(int i=0;i<nums.length-1;i++){
                start = Math.max(start,nums[i]);
                end += nums[i];
            }

            while(start<end){
                int mid = start + (end - start)/2;

                //calculating how many pieces  can we divide this max sum
                int sum =  0;
                int pieces = 1;
                for (int num = 0; num < nums.length-1 ; num++) {
                    if(sum+num>mid){
                        sum = num;
                        pieces++;
                    }else{
                        sum += num;
                    }
                }
                if(pieces>m){
                    start = mid+1;
                }else{
                    end = mid;
                }
            }

            return end;
    }
}
