public class WallProblem {
    public static void main(String[] args) {
        pattern4(5);
    }

//    public static void pattern(int n){
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(j);
//            }
//            System.out.println();
//        }
//    }
//    public static void pattern2(int n){
//        int k = 0;
//        for (int i = 0; i < 2*n; i++) {
//
//            if(i>n){
//                k = 2 * n - i;
//            }else{
//                k = i;
//            }
//
//            for (int j = 0 ; j < k; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }
//    public static void pattern3(int n){
//
//        for (int i = 1; i <= 2*n-1; i++) {
//
//            int c = 0 ;
//
//            if(i>n){
//                 c = 2 * n - i;
//            }else{
//                c = i;
//            }
//
//            for (int j = 0; j < n-c; j++) {
//                System.out.print(" ");
//            }
//
//            for (int j = c; j > 1; j--) {
//                System.out.print(j);
//            }
////            System.out.println();
////        }
////        for (int i = 0; i < n; i++) {
//
//            for (int j = 1; j <= c; j++) {
//                System.out.print(j);
//            }
//            System.out.println();
//        }
//    }

    public static void pattern4(int n){
        for (int i = 0; i <= 2*n; i++) {
            for (int j = 0; j <= 2*n; j++) {
                int num = Math.min(Math.min(i,j),Math.min(2*n-j,2*n-i));
                System.out.print(num+" ");
            }
            System.out.println();
        }
    }
}
