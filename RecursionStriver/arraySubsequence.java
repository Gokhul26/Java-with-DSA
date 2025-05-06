package RecursionStriver;

import java.util.ArrayList;
import java.util.List;

public class arraySubsequence {
    public static void main(String[] args) {
        int[] arr = {3,1,2};
        List<Integer> l = new ArrayList<>();
        generateSubArray(arr, l, 0);
    }

    private static void generateSubArray(int[] arr, List<Integer> l, int index){
        if(index == arr.length){
            System.out.println(l);
            return;
        }

        l.add(arr[index]);
        generateSubArray(arr, l, index+1);
        l.remove(l.size()-1);
        generateSubArray(arr, l, index+1);
    }
}
