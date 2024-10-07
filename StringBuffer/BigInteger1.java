package StringBuffer;
import java.math.BigInteger;

import Recursion.sumOfDigits;

import java.math.BigDecimal;

public class BigInteger1 {
    public static void main(String[] args) {
        // normal way of declaring a integer.
        // int a= 10;

        // BigInteger A = BigInteger.valueOf(5);
        // BigInteger B = BigInteger.valueOf(4);

        // BigInteger ans = A.add(B);
        // System.out.println(ans);

        // BigInteger one = new BigInteger("6554464466");
        // BigInteger two = new BigInteger("34567877655434");

        // BigInteger ans1 = one.add(two);

        // BigInteger ans2 = one.multiply(two);

        // BigInteger ans3 = one.subtract(two);

        // System.out.println(ans1);

        BigDecimal a = new BigDecimal("34665668.6683");
        BigDecimal b = new BigDecimal("45665789.23456787");

        BigDecimal ans = a.subtract(b);

        System.out.println( ans);
        System.out.println(b.pow(3));
        System.out.println(a.add(b));





    }
}
