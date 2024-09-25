package Recursion;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {4,53,2,1,7,8};
        arr=mergesort( arr);
        System.out.println(Arrays.toString(arr));
    }

    static int[] mergesort(int[] arr){
        if(arr.length == 1){
            return arr;
        }
        int mid = arr.length / 2;
        int[] left = mergesort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergesort(Arrays.copyOfRange(arr, mid, arr.length));
        return merge(left , right);
    }

    private static int[] merge(int[] left, int[] right) {
       int i = 0;
       int j = 0;
       int k = 0;
       int[] mergedArray = new int[left.length + right.length];
       while(i < left.length && j < right.length){
        if(left[i] < right[j]){
            mergedArray[k] = left[i];
            i++;
        }else{
            mergedArray[k] = right[j];
            j++;
        }
        k++;
       }
       while(i < left.length){
        mergedArray[k] = left[i];
        k++;
        i++;
       }
       while(j < right.length){
        mergedArray[k] = right[j];
        j++;
        k++;
       }
       return mergedArray;
    }
}
