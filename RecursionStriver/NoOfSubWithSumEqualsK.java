package RecursionStriver;

public class NoOfSubWithSumEqualsK {
    public static void main(String[] args) {
        int[] arr = {3,1,2,3};
        int k = 3;
        System.out.println(count(arr, 0, 0, k));
    }

    private static int count(int[] arr, int index, int sum, int k){

        if(index == arr.length){
            if(sum == k){
                return 1;
            }
            return 0;
        }

        int leftTake = count(arr, index+1, sum + arr[index], k);
        int rightNotTake = count(arr, index+1, sum, k);
        return leftTake + rightNotTake;
    }

}
