import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
//        int[] ans = merge(arr);
        merge2(arr,0,arr.length);
        System.out.print(Arrays.toString(arr));
    }

//    static int[] merge(int[] arr){
//        if(arr.length == 1){
//            return arr;
//        }
//
//        int mid = arr.length/2;
//
//        int[] left = merge(Arrays.copyOfRange(arr,0,mid));
//        int[] right = merge(Arrays.copyOfRange(arr,mid,arr.length));
//
//        return mergeSort(left,right);
//    }

//    static int[] mergeSort(int[] left,int[] right){
//        int[] nums = new int[left.length+right.length];
//
//        int i = 0;
//        int j = 0;
//        int k = 0;
//
//        while (i<left.length && j < right.length){
//            if(left[i] < right[j]){
//                nums[k] = left[i];
//                i++;
//            }
//            else{
//                nums[k] = right[j];
//                j++;
//            }
//            k++;
//        }
//
//        //if may be possible that one of the array is incomplete
//        //copy the remaining element
//        while (i<left.length){
//            nums[k] = left[i];
//            i++;
//            k++;
//        }
//
//        while (j<right.length){
//            nums[k] = right[j];
//            j++;
//            k++;
//        }
//
//        return nums;
//    }

    //in place approach


    static void merge2(int[] arr,int s,int e){

        if(e-s == 1){
            return;
        }

        int mid = (s+e)/2;

        merge2(arr,s,mid);
        merge2(arr,mid,e);

        mergeSort2(arr,s,mid,e);
    }

    static void mergeSort2(int[] arr,int s,int mid,int e){
        int[] nums = new int[e-s];

        int i = s;
        int j = mid;
        int k = 0;

        while (i < mid && j < e){
            if(arr[i] < arr[j]){
                nums[k] = arr[i];
                i++;
            }
            else{
                nums[k] = arr[j];
                j++;
            }
            k++;
        }

        //if may be possible that one of the array is incomplete
        //copy the remaining element
        while (i<mid){
            nums[k] = arr[i];
            i++;
            k++;
        }

        while (j<e){
            nums[k] = arr[j];
            j++;
            k++;
        }

//        return nums;
        for (int l = 0; l < nums.length; l++) {
            arr[s+l] = nums[l];
        }
    }


}
