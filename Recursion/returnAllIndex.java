package Recursion;

import java.util.ArrayList;

public class returnAllIndex {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,4,5};
        int target = 2;
        returnAllIndexValues(arr, target, 0);
        System.out.println(list);
    }
    static ArrayList<Integer> list = new ArrayList<>();
    static void returnAllIndexValues(int[] arr,int target,int index) {
        if(index == arr.length){
            return;
        }
        if(arr[index] == target){
            list.add(index);
        }
    
        returnAllIndexValues(arr, target, index+1); 
    }
}
