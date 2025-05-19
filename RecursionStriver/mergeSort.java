package RecursionStriver;

import java.util.Arrays;

public class mergeSort {
    public static void main(String[] args) {
        int[] arr = {8,7,3,9,2,1,4};
        System.out.println(Arrays.toString(arr));

        mergesort(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));
    }

    private static void mergesort(int[] arr, int left, int right){
        if(left < right){
            int mid = (left + right)/2;

            mergesort(arr, left, mid);
            mergesort(arr, mid + 1, right);

            merge(arr, left, mid, right);// first half is from left to mid and second half is from mid + 1 to right, so right is the ending position of the second part
        }
    }

    private static void merge(int[] arr, int left, int mid, int right){
        int[] temp = new int[right - left + 1];
        int i = left;
        int j = mid + 1;
        int index = 0;

        while(i <= mid && j <= right){
            if(arr[i] <= arr[j]){
                temp[index++] = arr[i++];
            }else{
                temp[index++] = arr[j++];
            }
        }

        while(i <= mid){
            temp[index++] = arr[i++];
        }

        while(j <= right){
            temp[index++] = arr[j++];
        }

        System.arraycopy(temp, 0, arr, left, temp.length);
    }

    // private static void printArr(int[] arr){

    // } 
}
