public class NoOfDigits {
    public static void main(String[] args) {
            System.out.println(Digits(1000,10));
    }

    private static int Digits(int n,int base){
        int ans = (int)(Math.log(1000) / Math.log(10)) + 1;
        return ans;

    }
}
