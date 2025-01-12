package RecursionPractice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Selection {
    public static void main(String[] args) {
        int[] arr = {4,3,2,1};
        Selection(arr,arr.length,0,0);
        System.out.print(Arrays.toString(arr));
    }

    static void Selection(int[] arr,int r,int c,int max){
        if(r == 0){
            return;
        }

        if(r>c){
            if(arr[c] > arr[max]){
                Selection(arr,r,c+1,c);
            }else{
                Selection(arr,r,c+1,max);
            }
        }else{
            int t = arr[max];
            arr[max] = arr[r-1];
            arr[r-1] = t;

            Selection(arr,r-1,0,0);
        }
    }
}
