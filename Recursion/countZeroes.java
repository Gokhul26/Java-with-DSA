package Recursion;

public class countZeroes {
    public static void main(String[] args) {
        int n = 203040;
        System.out.println(count(n));
    }
    static int count(int n){
        return helper(n , 0);
    }
    private static int helper(int n, int c) {
       if( n == 0){
        return c;
       }
       int rem = n % 10;
       if( rem == 0 ){
        return helper(n / 10, c+1);
       }
       else{
        return helper(n/ 10, c);
       }
    }
}
