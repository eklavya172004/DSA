public class ReverseAnNumber {
    public static void main(String[] args) {
        System.out.println(palindrome(123432));
        System.out.print(reverse(1));
    }

    static int reverse(int n){
        int digits = (int)Math.floor(Math.log10(n)) + 1;

        if(n == 0){
            return 0;
        }

        return (int)((n%10) * Math.pow(10,digits-1) + reverse(n/10));
    }

    static boolean palindrome(int n){
        return n == reverse(n);
    }
}
