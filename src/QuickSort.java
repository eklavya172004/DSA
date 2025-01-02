import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] ans = {4,9,3,6,6,6,5};
        Sort(ans,0,ans.length-1);
        System.out.print(Arrays.toString(ans));
    }

    public static void Sort(int[] arr, int low, int high){
        // base condition::::::::::::::::::::::::::::::::::::::::::
        if(low>=high) return;

        int s = low;
        int e = high;

        int mid = s + (e-s)/2;

        int pivot = arr[mid];

        while (s<=e){
            while (arr[s] < pivot){
                s++;
            }

            while (arr[e] > pivot){
                e--;
            }
        //will only swap if there is violation
            if (s<=e) {
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;

                s++;
                e--;
            }
            }

        //now my pivot is at correct index
        //sort the two halves

        Sort(arr,low,e);
        Sort(arr,s,high);
    }
}
