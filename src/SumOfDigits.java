public class SumOfDigits {
    public static void main(String[] args) {
            System.out.print(product(0));
    }

    //recursion call for sum
    static int digitSum(int n){
        if(n==0){
            return n;
        }

        return digitSum(n/10) + n%10;
    }

    static int product(int n){
        if(n%10==n){
            return n;
        }

        return product(n/10) * (n%10);
    }
}
