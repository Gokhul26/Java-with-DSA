import java.util.Scanner;

public class RollNo {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
    //    int num1 = input.nextInt();
    //    int num2 = input.nextInt();
    //    int sum = num1 + num2;
       //    System.out.println(sum);
        float TemC = input.nextFloat();
        float faren = ( TemC*9/5) + 32;
        System.out.println(faren);
      input.close();

}
}
