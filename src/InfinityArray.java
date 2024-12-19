public class InfinityArray {
    public static void main(String[] args) {
        int[] nums = {2,3,4,5,6,7,8,9,10,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32};
        int bs = ans(nums,25);
        System.out.println(bs);
    }

    static int ans(int[] arr,int target){
            int s = 0;
            int e = 1;

            while(target > arr[e]){
                int newStart = e+1;
                e = e + (e-s+1)*2;
                s = newStart;
            }

            return BinarySearch(arr,target,s,e);
    }

    static int BinarySearch(int[] arr,int target,int start,int end){
        int s = start;
        int e = end;

        while(s<=e){

        int mid =  s + (e-s)/2;

            if(target>arr[mid]){
                s=mid+1;
            }
            else if(target<arr[mid]){
                e = mid - 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
