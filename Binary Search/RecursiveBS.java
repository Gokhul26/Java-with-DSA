public class RecursiveBS {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int s = 0;
        int e = arr.length - 1;
        int target = 3;
        System.out.println(BS(arr,target,s,e));

    }
    static int BS(int[] arr,int target, int s,int e){
        int mid = s + ( e - s)/2;
        if(s > e){
            return -1;
        }
        if(arr[mid] == target){
            return mid;
        }
        if(arr[mid]< target){
            return BS(arr,target, mid + 1, e);
        }
        else{
            return BS(arr,target, s,mid -1);
        }

    }
}
