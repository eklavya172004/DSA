import java.util.Arrays;

public class MergeSortInplace {
    public static void main(String[] args) {
        int[] arr = {2,7,8,4,5};
        mergeSortInPlace(arr,0,arr.length);
        System.out.print(Arrays.toString(arr));
    }

    static void mergeSortInPlace(int[] arr,int s,int e){
        if(e-s == 1){
            return;
        }

        int mid = (s+e)/2;

        mergeSortInPlace(arr,s,mid);
        mergeSortInPlace(arr,mid,e);

        mergeSort(arr,s,mid,e);
    }

    static void mergeSort(int[] arr,int s,int mid,int e){
        int[] nums = new int[e-s];

        int i = s;
        int j = mid;
        int k = 0;

        while (i<mid && j < e){
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

        for (int l = 0; l < nums.length; l++) {
            arr[s+l] = nums[l];
        }
    }
}
