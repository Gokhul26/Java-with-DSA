public class PrintRecursion {
    public static void main(String[] args) {
        printNos(1);    }

    static void printNos(int n)
    {
        if(n==5){
            return;
        }
        System.out.println(n);
        printNos(n +1);
    }
}
