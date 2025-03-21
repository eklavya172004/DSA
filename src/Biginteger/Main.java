package Biginteger;

import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        int a = 30;
        int b = 67;

        BigInteger A = BigInteger.valueOf(232123212);
        BigInteger B = BigInteger.valueOf(22); //convert int/long into BI
        int c = B.intValue(); //convert BI into int
        BigInteger C = new BigInteger("2322132323232323232322");

//        constants
        BigInteger D = BigInteger.TEN;
//        addition
        BigInteger s = A.add(B);

//        mutliply
        BigInteger m = C.multiply(B);
        BigInteger sub = C.subtract(A);

//        divide
        BigInteger d = C.divide(A);

//        System.out.println(d);

        if (B.compareTo(A) <0){
            System.out.println("Yes");
        }

//        System.out.println(Factorial.fact(232));
    }
}
