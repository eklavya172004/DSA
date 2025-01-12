package RecursionPractice;

import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = {4,2,7,9,10};
        recursion(arr,arr.length-1,0);
        System.out.print(Arrays.toString(arr));
    }

    static void recursion(int[] arr,int r,int c){
        if(r == 0){
            return;
        }

        if(r>c){
            if(arr[c] > arr[c+1]){
                    int temp = arr[c];
                    arr[c] = arr[c+1];
                    arr[c+1] = temp;
            }
            recursion(arr,r,c+1);
        }else{
            recursion(arr,r-1,0);
        }
    }
}
