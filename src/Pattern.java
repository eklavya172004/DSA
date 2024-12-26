public class Pattern {
    public static void main(String[] args) {

        pattern2(5);
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
}
