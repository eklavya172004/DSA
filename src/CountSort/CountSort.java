package CountSort;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountSort {

    public static void countSort(int[] arr){
        if (arr == null || arr.length<=1){
            return;
        }

        int max = arr[0];
        for (int num: arr) {
            if (num>max){
                max = num;
            }
        }

        int[] freq = new int[max+1];

        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]] += 1;
        }

        int index = 0 ;
        for (int i = 0; i < freq.length; i++) {
            while (freq[i] > 0 ){
                arr[index] = i;
                index++;
                freq[i]--;
            }
        }
    }

    public static void countHash(int[] arr){
        if (arr == null || arr.length<=1){
            return;
        }

        int max = Arrays.stream(arr).max().getAsInt();

        int min = Arrays.stream(arr).min().getAsInt();

        Map<Integer,Integer> map = new HashMap<>();

        for (int num : arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        int index = 0 ;

        for (int i = min; i <= max; i++) {
              int count = map.getOrDefault(i,0);
            for (int j = 0; j < count; j++) {
                arr[index] = i;
                index++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {6,3,9,10,2,4,7};
        countHash(arr);

        System.out.println(Arrays.toString(arr));
    }

}
