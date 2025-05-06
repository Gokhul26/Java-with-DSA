package RecursionStriver;

import java.util.ArrayList;
import java.util.List;

public class subsqEqualsK {
    public static void main(String[] args) {
        int[] arr = {3,1,2,1};
        int k = 3;
        List<Integer> l = new ArrayList<>();
        generateSubEqualsK(arr, l, 0, k, 0);
    }

    private static void generateSubEqualsK(int[] arr, List<Integer> curr, int index, int k, int sum){
        if(index == arr.length){
            if(sum == k){
                System.out.println(curr);
            }
            return;
        }
        curr.add(arr[index]);
        generateSubEqualsK(arr, curr, index+1, k, sum + arr[index]);
        curr.remove(curr.size() - 1);
        generateSubEqualsK(arr, curr, index+1, k, sum);
    }
}
