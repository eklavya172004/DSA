package RecursionPractice;

import java.util.Arrays;

public class Insertion {
    public static void main(String[] args) {
        int[] arr = {5,4,61,2};
//        insertion(arr);
//        System.out.print(Arrays.toString(arr));
        recursion(arr,arr.length,0);
        System.out.print(Arrays.toString(arr));
    }

//    static void insertion(int[] arr){
//
//        for(int i= 0 ; i< arr.length;i++){
//        int j = i;
//
//        while (j>0 && arr[j-1]>arr[j]){
//            int temp = arr[j-1];
//            arr[j-1] = arr[j];
//            arr[j] = temp;
//            j--;
//        }
//        }
//    }
    static void recursion(int[] arr,int r,int c){
        if(r==c){
            return;
        }

        int j = c;
        while (j>0 && arr[j-1]>arr[j]){
            int temp = arr[j-1];
            arr[j-1] = arr[j];
            arr[j] = temp;
            j--;
        }

        recursion(arr,r,c+1);
    }
}
