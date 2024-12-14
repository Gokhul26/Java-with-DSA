import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = 0;
        int b = 1;
        int count = 2;
        int n = in.nextInt();

        if (n>=1){
            System.out.println(a + " ");
        }
        if (n>=2){
            System.out.println(b + " ");
        }

        while (count < n){
            int temp = b;
            b = a+b;
            a = temp;
            System.out.println(b + " ");
            count ++;
        }
        in.close();
    }
    
}