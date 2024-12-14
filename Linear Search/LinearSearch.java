public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int target = 3;
        int ans = linearSearch(arr, target);
        System.out.println(ans);
    }
    static int linearSearch(int[] arr,int target){
        if(arr.length == 0){
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if(element == target){
                return i;
        
            }
        }
        return -1; 

    }
}
