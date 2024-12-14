

public class maxConsecOnes {
    public static void main(String[] args) {
        int[] arr = { 1,1,1,1,0,0,0,1,1,1,1,0};
        System.out.println(func(arr, 2));
    }

    static int func(int[] arr, int k){
        int left = 0, right = 0, maxLength = 0, zeroes = 0;
        while( right < arr.length){
            if(arr[right] == 0){
                zeroes++;
            }
            if(zeroes > k){
                if(arr[left] == 0){
                    zeroes --;
                }
                left++;
            }
            if(zeroes<=k){
                maxLength = Math.max(maxLength, right - left + 1);
            }
            right++;
        }
        return maxLength;
    }
    
}