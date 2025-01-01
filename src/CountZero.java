public class CountZero {
    public static void main(String[] args) {
        int N = 10;
        System.out.print(zero(N,0));
    }

//    static int count=0;
//    //we are using count outside
//    static int zero(int n){
//        int N = n%10;
//
//        if(n == 0){
//            return count;
//        }
//
//        if(N == 0 ){
//            count++;
//        }
//
//         return zero(n/10);
//    }

    static int zero(int N,int count){

            if(N == 0){
                return count;
            }

            int digit = N % 10;

            if (digit == 0) {
               return zero(N / 10, count + 1);
            } else {
               return zero(N / 10, count);
            }
    }
}
