import java.util.ArrayList;
import java.util.Collections;

public class arrRev {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(9);
        arr.add(5);
        arr.add(3);
        Collections.reverse(arr);

        System.out.println(arr);
    }
}
