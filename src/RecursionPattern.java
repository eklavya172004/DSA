import java.util.Arrays;

public class RecursionPattern {
    public static void main(String[] args) {
//        bubble({1,23},0);
//    int[] arr = {4,3,2,1};
        int[] arr = {4,3,5,1,89};
//    bubble(arr,arr.length-1,0);
     selectionR(arr,arr.length,0,0);
    System.out.println(Arrays.toString(arr));
    }

    static void triangle(int r,int c){
        if(r == 0){
            return;
        }

        if(r>c){
            System.out.print("*");
            triangle(r,c+1);
        }else{
            System.out.println();
            triangle(r-1,0);
        }
    }
    static void bubble(int[] arr,int r,int c){
        if(r == 0){
            return;
        }

        if(r>c){

            if(arr[c] > arr[c+1]){
                int temp = arr[c];
                arr[c] = arr[c+1];
                arr[c+1] = temp;
            }
            bubble(arr,r,c+1);
        }else{
            bubble(arr,r-1,0);
        }
    }

    static void selection(int[] arr,int r){
        int max  = 0;

        if(r>0) {

            for (int i = 0; i <= r; i++) {
                if (arr[i] > arr[max]) {
                    max = i;
                }
            }

            int temp = arr[max];
            arr[max] = arr[r];
            arr[r] = temp;

            selection(arr, r - 1);
        }
        }

//    static void selectionR(int[] arr,int r,int max){
//
//        if(r>0) {
//
//            for (int i = 0; i <= r; i++) {
//                if (arr[i] > arr[max]) {
//                    max = i;
//                }
//            }
//
//            int temp = arr[max];
//            arr[max] = arr[r];
//            arr[r] = temp;
//
//            selectionR(arr, r - 1,max);
//        }
//    }

//    static int max(int[] arr,int r){
//        int max = 0;
//
//        for (int i = 0; i <= r ; i++) {
//            if(arr[i] > max){
//                max = i;
//                }
//            }
//
//        return max;
//    }

//    static void triangle(int r,int c){
//        if(r == 0){
//            return;
//        }
//
//        if(r>c){
//            triangle(r,c+1);
//            System.out.print("*");
//        }else{
//            triangle(r-1,0);
//            System.out.println();
//        }
//    }

//    static void selection(int[] arr,int r){
//        int max  = 0;
//
//        if(r>0) {
//
//            for (int i = 0; i <= r; i++) {
//                if (arr[i] > arr[max]) {
//                    max = i;
//                }
//            }
//
//            int temp = arr[max];
//            arr[max] = arr[r];
//            arr[r] = temp;
//
//            selection(arr, r - 1);
//    }
//}

//    static void selectionR(int[] arr,int r,int c,int max){
//        if(r == 0){
//            return;
//        }
//
//        if(r > c){
//            if(arr[c] > arr[max]){
//            selectionR(arr,r,c+1,c);
//            }else{
//                selectionR(arr,r,c+1,max);
//            }
//         //this is take out the maximum number from the iteration
//        }else{
//            int temp = arr[max] ;
//            arr[max] = arr[r-1];
//            arr[r-1] = temp;
//
//            selectionR(arr,r-1,0,0);
//        }
//    }

    static void selectionR(int[] arr,int r,int c,int max){
        if(r==0) return;

        if(r>c){
            if(arr[c]>arr[max]){
                selectionR(arr,r,c+1,c);
            }else{
                selectionR(arr,r,c+1,max);
            }
        }else{
            int temp = arr[max];
            arr[max] = arr[r-1];
            arr[r-1] = temp;

            selectionR(arr,r-1,0,0);
        }
    }
}
