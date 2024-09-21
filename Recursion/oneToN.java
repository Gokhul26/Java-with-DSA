package Recursion;

public class oneToN {
    public static void main(String[] args) {
        int n = 5;
        both(n);
    }

    // static void oneton(int n){
    //     if(n==0){
    //         return ;
    //     }
    //     oneton(n-1);
    //     System.out.println(n);
    // }

    static void both(int n){
        if(n==0){
            return ;//The return here ensures that when the recursion reaches n == 0, the recursion stops, preventing an infinite loop or unnecessary recursive calls. It acts as the base case for the recursion.
        }
        System.out.println(n);
        both(n-1);
        System.out.println(n);
    }
    // static int factorial(int n ){
    //     if(n<=1){
    //         return 1;
    //     }
    //     return (n *factorial(n-1));
    // }
}
