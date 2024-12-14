package Microsoft;

public class MaxSubarray {
    public static void main(String[] args) {
        int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(subarray(arr));
    }

    static int subarray(int[] arr){
        int currentSum = arr[0];
        int maxSum = arr[0];
        int start = 0, end = 0;
        while(end < arr.length){
            if(currentSum < 0){
                start = end;
                currentSum = arr[end];
            }else{
                currentSum += arr[end];
            }
            maxSum = Math.max(currentSum, maxSum);
            end ++;
        }
        return maxSum;
    }

}
