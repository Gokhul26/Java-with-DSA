public class Binarysearch {
    public static void main(String[] args) {
        int[] nums = {-1,0,56,78,89,90,900,4556,45678,34568789};
        int target = 90;
        int ans = binarySearch(nums, target);
        System.out.println(ans);

    }

    static int binarySearch(int[] nums,int target){
        int start = 0;
        int end = nums.length -1;
       
        while (start <= end){
            int mid =   start + (end - start)/2;
            if (target < nums[mid]){
                end = mid -1;
            } else if (target > nums[mid]){
                start = mid +1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}