package Recursion;

public class sumOfDigits {
    public static void main(String[] args) {
        int ans = productOfDigits(432);
        System.out.println( ans);
    }
    static int sumdigits(int n ){
        if(n == 0){
            return 0;
        }
        return (n%10) + sumdigits(n/10);
    }
    static int productOfDigits(int n ){
        if(n%10 == n){
            return n;
        }
        return (n%10) * productOfDigits(n/10);
    }
}
