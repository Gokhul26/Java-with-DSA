package StringBuffer;
import java.util.Random;

// import Recursion.reverseNo;

public class RandomValue {
    public static void main(String[] args) {
        // Random value = new Random();
        // System.out.println(value.nextFloat());
        System.out.println(generate(12));
    }

    static String generate(int size){
        StringBuffer sb = new StringBuffer();

        Random ran = new Random();

        for (int i = 0; i < size; i++) {
            int randomChar = 97 + (int)(ran.nextFloat()* 26);
            sb.append((char) randomChar);
        }
        return sb.toString();
    }
}
