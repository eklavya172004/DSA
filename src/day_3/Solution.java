package day_3;

class Solution {
    public static void main(String[] args) {
        int ans = minBitFlips(3,4);
        System.out.print(ans);
    }

    public static int minBitFlips(int start, int goal) {
        int sum = start^goal;

        int count = 0 ;

        while(sum>0){
            sum -= (sum&(-sum));
            count++;
        }

        return count;
    }
}