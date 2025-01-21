package day2;

public class Digittobinary {
    public static void main(String[] args) {
        int ans = binarytodecimal("1010");
        System.out.print(ans);
    }

    public static String binary(int n){

        StringBuilder str = new StringBuilder();

        while(n>0){
            if(n%2==1){
                str.append("1");
            }else{
                str.append("0");
            }

            n /= 2;
        }
    str.reverse();

        return str.toString();
    }

    public static int binarytodecimal(String str){
        int n = str.length();
        int num = 0;
        int pow = 1;

        for (int i = n - 1; i >= 0 ; i--) {
            if(str.charAt(i) == '1'){
                num = num + pow;
            }

            pow = pow * 2;
        }

        return num;
    }
}
