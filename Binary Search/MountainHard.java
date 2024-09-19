public class MountainHard {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,3,0};
        int target = 3;
        int peak = peakElement(arr);
        int LeftCheck = orderAgnosticBS(arr, target, 0, peak);
        if(LeftCheck != -1){
            System.out.println(LeftCheck);
        }
        else{
            System.out.println(orderAgnosticBS(arr, target, peak, arr.length-1)); 
        }

    }
    static int  peakElement(int[] arr){
        int start = 0;
        int end = arr.length -1;
        while(start<end){
            int mid = start + (end - start)/2;
            if(arr[mid] > arr[mid +1]){
                end = mid;
            }
            else{
                start = mid +1;
            }
        }
        return start;
    }
    static int orderAgnosticBS(int[] arr, int target, int start , int end){
        boolean isAcs = arr[start]<arr[end];
        while(start<=end){
            int mid = start + (end - start)/2;
            if ( target == arr[mid]){
                return mid;
            }
            if(isAcs){
                if(target > arr[mid]){
                    start = mid + 1;

                }
                else{
                    end = mid -1;
                }

            }
            else{
                if(target< arr[mid]){
                    start = mid + 1;
                }
                else{
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
