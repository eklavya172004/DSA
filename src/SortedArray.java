public class SortedArray {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int ans = search(arr,6);
        System.out.println(ans);
    }

    static int search(int[] nums,int target){
        int pivot = pivot(nums);

        if(pivot == -1){
            //just do binary search
            return BinarySearch(nums,target,0,nums.length-1);
        }

        //if pivot is found, you have found 2 asc sorted array
        if(nums[pivot] == target){
            return pivot;
        }else if(target>=nums[0]){
            return BinarySearch(nums,target,0,pivot-1);
        }

        return BinarySearch(nums,target,pivot+1,nums.length-1);
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

    static int pivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start<=end){
            int mid = start + (end-start)/2;

            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }else if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }else if(arr[start]>=arr[mid]){
                end = mid-1;
            }else{
                start = mid + 1;
            }
        }
        return -1;
    }
    static int Duplicatespivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start<=end){
            int mid = start + (end-start)/2;

            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }else if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
//    if elements at middle,start,end are equal then just skip the duplicates

            if(arr[mid] == arr[start] && arr[mid] == arr[end]){
                //skip the duplicates

//                NOTE:what if these elements at start and end were pivot
                if(arr[start] > arr[start+1]){
                    return start;
                }

                if(arr[end] < arr[end-1]){
                    return end-1;
                }
                start++;
                end--;
            }else if(arr[start] < arr[mid] || arr[start] == arr[mid] && arr[mid]>arr[end]){
                start = mid + 1;
            }else{
                end = mid - 1;
            }

        }
        return -1;
    }
}
