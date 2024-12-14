package Leetcode;

public class CeilingOfNumber {
    public static void main(String[] args) {
        int[] arr = {2,4,6,7,8,9,};
        int target = 5;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
        ;
    }

    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end-start)/2;
            if(target == arr[mid]){
                return mid;
            }
            if(target  <  arr[mid]){
                end = mid - 1;
            }
            if(target > arr[mid]){
                start = mid +1;
            }
        }
        return start;
    }
}
