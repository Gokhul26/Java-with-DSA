public class secondLargAndSmall {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int n = arr.length;

        int sSmallest = secondSmallest(arr, n);
        int sLargest = secondLargest(arr, n);

        System.out.println(sSmallest + " " + sLargest);
    }

    private static int secondLargest(int[] arr, int n){
        int largest = arr[0];
        int slarge = -1;

        for(int i = 1 ; i < n ; i++){
            if(arr[i] > largest){
                slarge = largest;
                largest = arr[i];
            }else if(arr[i] < largest && arr[i] > slarge){
                slarge = arr[i];
            }
        }
        return slarge;
    }

    private static int secondSmallest(int[] arr, int n){
        int smallest = arr[0];
        int sSmall = Integer.MAX_VALUE;

        for (int i = 1; i < arr.length; i++) {
            if(smallest > arr[i]){
                sSmall = smallest;
                smallest = arr[i];
            }else if(arr[i] != smallest && arr[i] < sSmall){
                sSmall = arr[i];
            }
        }
        return sSmall;
    }
}
