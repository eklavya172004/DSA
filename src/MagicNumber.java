public class MagicNumber {
    public static void main(String[] args) {
        int n = 6;
        System.out.println(Magic(n));
    }

    private static int Magic(int n){
        int sum = 0;

//        for( int i = 0 ; i< 32 ; i++){
//            sum += (int) (((n>>i) & 1 ) * Math.pow(5,(i+1)));
//        }
        int base = 5;

            while(n>0){
                int last = n & 1;
                n = n >>1;
                sum += last *base;
                base = base * 5;
            }
        return sum;
    }
}
