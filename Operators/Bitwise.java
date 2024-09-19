package Operators;

public class Bitwise {
    public static void main(String[] args) {
        int[] arr = {1,2,3,3,2,1,4};
        System.out.println(findUnique(arr));
    }
    static int findUnique(int[] arr){
        int unique = 0;
        for(int n:arr){
            unique ^= n;
        }
        return unique;
    }
}
