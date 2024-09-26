package Recursion;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {7,6,1,4,3};
        qs(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void qs(int[] arr,int low,int high){
        if(low>=high){
            return;
        }
        int s = low;
        int e = high;
        int mid = s + (e-s)/2;
        int pivot = arr[mid];
        while(s <= e){
            while(arr[s]<pivot){
                s++;
            }
            while(arr[e]>pivot){
                e--;
            }
            if(s <= e){
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }
        qs(arr, low, e);
        qs(arr, s, high);
    }
}
