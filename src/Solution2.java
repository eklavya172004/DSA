public class Solution2 {
    public static void main(String[] args) {
//        long ans = reverseBits(000000101001010000011110100111000);
    }
    // you need treat n as an unsigned value
    public static long reverseBits(long n) {
        long count = 0;

        for( int i = 0 ; i < 32 ; i++){

            long result = (1 >> (32 - i) ) & n;

            count |= result << (32-i);
        }

        return count;
    }
}