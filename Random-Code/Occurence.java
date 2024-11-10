public class Occurence {
    public static void main(String[] args) {
    int n =345333321;
        int count = 0;
        while (n>0){
            int rem = n % 10;
            n = n / 10;
            if (rem == 3){
                count ++;
            }
        }
        System.out.println(count);
    }
}