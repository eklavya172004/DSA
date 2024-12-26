public class NoOfSetBits {
    public static void main(String[] args) {
        int n= 234;
        System.out.println(Integer.toBinaryString(n));
        int count = 0;

        while(n>0){
            n -= (n&(-n));
            count++;
        }
    System.out.println(count);
    }
}
