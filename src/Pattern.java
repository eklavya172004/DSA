public class Pattern {
    public static void main(String[] args) {

        Numberpattern(4);
    }

    static void pattern2(int n){
//        int k = 0;
        for (int i=0;i<2*n;i++){
            int k = (i >  n)? 2*n - i: i ;
            for(int j = 0;j<k;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static  void pattern(int n){
        for(int i=1;i<= 2*n-1;i++){

            for(int j=1;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    //
//          *
//         * *
//        * * *
//       * * * *
//      * * * * *
//       * * * *
//        * * *
//         * *
//          *
//
    static void patternBig(int n){
        for (int i = 0; i < 2*n; i++) {

            int totalCol = i > n ? 2*n - i  : i ;

            for (int j = 0; j < totalCol ; j++) {

                System.out.print("* ");

            }

            System.out.println();
        }
    }

    static void patternSpaceBig(int n){
        for (int i = 0; i < 2*n; i++) {

            int totalCol = i > n ? 2*n - i  : i ;

            int noOfSpaces = n-totalCol;

            for (int s = 0; s < noOfSpaces; s++) {
                System.out.print(" ");
            }

            for (int j = 0; j < totalCol ; j++) {

                System.out.print("* ");

            }

            System.out.println();
        }
    }

    static void patternNumber(int n){
        for (int i = 1; i <= n; i++) {

            for (int k = 0; k <= n-i ; k++) {
                System.out.print(" ");
            }

            //left loop
            for (int j = i; j >= 1 ; j--) {
                System.out.print(j);
            }

            //right loop
            for (int j = 2; j <= i ; j++) {
                System.out.print(j);
            }

            System.out.println();
        }
    }


    static void patternNumber2(int n){
        for (int i = 1; i < 2*n; i++) {

            int totalcol =  i > n ? 2*n - i : i ;

            for (int k = 0; k <= n-totalcol ; k++) {
                System.out.print(" ");
            }

            //left loop
            for (int j = totalcol; j >= 1 ; j--) {
                System.out.print(j);
            }

            //right loop
            for (int j = 2; j <= totalcol ; j++) {
                System.out.print(j );
            }

            System.out.println();
        }
    }

    static void Numberpattern(int n){
        for (int i = 0; i < 2*n; i++) {
            for (int j = 0; j < 2*n; j++) {
                int index = n - Math.min(Math.min(i,j),Math.min(2*n-i,2*n-j));
                System.out.print(index+" ");
            }
            System.out.println();
        }
    }
}
