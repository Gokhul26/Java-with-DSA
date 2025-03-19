

public class isPrime {
    public static void main(String[] args) {
        int n = 7;
        System.out.println(isPrimeOrNot(n));
    }

    private static boolean isPrimeOrNot(int n){
        if(n <= 1){
            return false;
        }

        int c = 2;
        if(n % 2 != 0){
            for (int i = 3; i < n; i+=2) {
                if(n % i == 0){
                    return false;
                }
            }
        }

        return true;
    }
}
