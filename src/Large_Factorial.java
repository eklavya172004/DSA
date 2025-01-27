public class Large_Factorial {
    public static void main(String[] args) {
        String ans = solve(5);
        System.out.println(ans);
    }

    public static String solve(int A) {
       int ans = factorial(A);

       return Long.toString(ans);
    }

    public static int factorial(int A){

        if(A == 0){
            return 1;
        }

        if(A<0){
            return 0;
        }

        return A * factorial(A-1);
    }
}
