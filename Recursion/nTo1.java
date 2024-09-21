package Recursion;

public class nTo1 {
    public static void main(String[] args) {
        int n = 5;
        nTo1(n);
    }
    static void nTo1(int n){
        if(n==0){
            return ;
        }
        System.out.println(n);
        nTo1(n-1);
    }
}
