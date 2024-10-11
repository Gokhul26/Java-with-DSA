package TwoPointer;

public class cardPoints {
    public static void main(String[] args) {
        int[] arr = {6,2,3,4,7,2,1,7,1};
        System.out.println(maxScore(arr, 4));
    }
    static int maxScore(int[] cardPoints, int k) {
        int leftSum = 0,rightsum = 0,maxSum = 0,sum = 0;
        for (int i = 0; i < k; i++) {
            leftSum = leftSum + cardPoints[i];
        }
        maxSum = leftSum;
        for (int i = 0; i < k; i++) {
            rightsum = rightsum + cardPoints[cardPoints.length - i -1];
            leftSum = leftSum - cardPoints[k - i - 1];
            sum = leftSum + rightsum;
            if(sum > maxSum){
                maxSum = sum;
            }
        }
        return maxSum;
    }
}
