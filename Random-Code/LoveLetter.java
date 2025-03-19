public class LoveLetter {
    public static void main(String[] args) {
        String str = "abcba";
        String str2 = "cba";

        int count = 0;

        System.out.println(func(str2, count));
    }

    private static int func(String str, int count) {
        char[] arr = str.toCharArray();
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            if (arr[left] != arr[right]) {
                count += Math.abs(arr[left] - arr[right]); // Difference in ASCII values
            }
            left++;
            right--;
        }

        return count;
    }
}
