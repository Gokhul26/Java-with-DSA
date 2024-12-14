public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        // int[] arr = {-1,0,56,78,89,90,900,4556,45678,34568789};
        int[] arr = {90,54,32,21,10,5,3,-1,-2};
        int target = -2;
        int ans = orderAgnosticBS(arr, target);
        System.out.println(ans);
    }
    static int orderAgnosticBS(int[] arr, int target){
        int s = 0;
        int end = arr.length - 1;
        boolean isAcs = arr[s] < arr[end];
        while (s <= end){
            int mid = s + (end - s)/2;
            if (arr[mid] == target){
                return  mid;
            }
            if (isAcs){
                if(target >  arr[mid]){
                    s = mid+1;
                }
                else{
                    end = mid -1;
                }
            }
            else {
                if(target < arr[mid]){
                    s = mid+1;
                }
                else{
                    end = mid -1;
                }
            }
        }
        return -1;
    }
}
