public class MinimumElement {
    public static void main(String[] args) {
        int arr[] = {5,-3,7,8,0,1};
        System.out.println(min(arr));

    }
    static int min(int[] arr){
        int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < ans){
                ans = arr[i];
            }
        }
        return ans;
    }
}
