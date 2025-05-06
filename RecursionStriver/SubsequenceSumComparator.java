package RecursionStriver;
import java.util.*;

public class SubsequenceSumComparator {

    public static void printSubsequencesWithSumCondition(int[] arr, int k, String condition) {
        List<Integer> current = new ArrayList<>();
        generateSubsequences(arr, 0, current, 0, k, condition);
    }

    private static void generateSubsequences(int[] arr, int index, List<Integer> current, int sum, int k, String condition) {
        if (index == arr.length) {
            if ((condition.equals("<") && sum < k) ||
                (condition.equals(">") && sum > k)) {
                System.out.println(current);
            }
            return;
        }

        current.add(arr[index]);
        generateSubsequences(arr, index + 1, current, sum + arr[index], k, condition);

        current.remove(current.size() - 1);
        generateSubsequences(arr, index + 1, current, sum, k, condition);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int k = 3;
        
        System.out.println("Subsequences with sum < " + k + ":");
        printSubsequencesWithSumCondition(arr, k, "<");

        System.out.println("\nSubsequences with sum > " + k + ":");
        printSubsequencesWithSumCondition(arr, k, ">");
    }
}
