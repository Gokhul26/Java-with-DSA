import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int ans = 0;
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.print("Enter the operator: ");
            char op = in.next().trim().charAt(0);
            
            if (op == 'X' || op == 'x') {
                break;
            }

            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                System.out.print("Enter the two numbers: ");
                int num1 = in.nextInt();
                int num2 = in.nextInt();

                if (op == '+') {
                    ans = num1 + num2;
                } else if (op == '-') {
                    ans = num1 - num2;
                } else if (op == '*') {
                    ans = num1 * num2;
                } else if (op == '/') {
                    if (num2 != 0) {
                        ans = num1 / num2;
                    } else {
                        System.out.println("Division by zero is not allowed.");
                        continue; // Skip printing the result and continue the loop
                    }
                } else if (op == '%') {
                    ans = num1 % num2;
                }

                System.out.println("Result: " + ans);
            } else {
                System.out.println("Enter a valid operator.");
            }
        }
        in.close();
    }
}
