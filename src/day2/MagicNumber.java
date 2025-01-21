package day2;

public class MagicNumber {
    public static void main(String[] args) {
        int ans = sum(5);
        System.out.print(ans);
    }

    public static int sum(int n){
        int sum = 0 ;
        int base = 5;

        while(n>0){
            int last  = n & 1;
            n = n>>1;
            sum += last * base;
            base = base * 5;
        }

        return sum;
    }
}
