package Pow_leetcode;

class Solution {
    public static void main(String[] args) {
        System.out.println(myPow(2,3));
    }

    public static double myPow(double x, int n) {
       double x1 = 0;
       
       for(int i = 0 ; i<n ; i++){
            x1 = x*x + x1;
       }

       return x1;
    }
}