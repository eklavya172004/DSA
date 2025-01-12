package RecursionPractice;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {7,2,1,5,10};
        QSort(arr,0,arr.length-1);
        System.out.print(Arrays.toString(arr));
    }

    public static void QSort(int[] arr,int low,int high){
        if(low>= high){
            return;
        }

        int s = low;
        int e = high;

        int mid = s + (e-s)/2;

        int pivot = arr[mid];

        while(s<=e) {
            while (arr[s] < pivot) {
                s++;
            }

            while (arr[e] > pivot) {
                e--;
            }

            if (s <= e) {
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }

        QSort(arr,low,e);
        QSort(arr,s,high);
    }
}
