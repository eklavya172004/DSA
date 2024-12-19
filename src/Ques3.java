import java.util.Arrays;

public class Ques3 {
    public static void main(String[] args) {
        int[] nums = {2,3,5,5,6};
        int target = 5;
        int[] ans = searchRange(nums, target);
        System.out.println( Arrays.toString(ans));
    }

    static int Ceiling(int[] arr,int target){

        int s = 0;
        int e = arr.length-1;
        int result = -1;

        while(s<=e){
            int mid = s + (e-s)/2;

            if(target<arr[mid]){
                e = mid - 1;
            }
            else if(target>arr[mid]){
                s = mid+1;
            }
            else{
                result = mid;
                s = mid + 1;
            }
        }
        return result;
    }

    static int Floor(int[] arr,int target){
//    if(target < arr[0]){
//        return -1;
//    }

        int s = 0;
        int e = arr.length-1;
        int result = -1;

        while(s<=e){
            int mid = s + (e-s)/2;

            if(target<arr[mid]){
                e = mid - 1;
            }
            else if(target>arr[mid]){
                s = mid+1;
            }
            else{
                result = mid;
                e = mid - 1;
            }
        }
        return result;
    }

        public static int[] searchRange(int[] nums, int target) {

            int  s = Floor(nums,target);
            int e = Ceiling(nums,target);

            if (s == -1 || e == -1) {
                return new int[]{-1, -1};
            }

            return new int[]{s,e};
        }

}
