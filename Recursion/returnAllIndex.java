package Recursion;

import java.util.ArrayList;

public class returnAllIndex {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,4,5};
        int target = 2;
        // returnAllIndexValues(arr, target, 0);
        // System.out.println(list);
        // System.out.println(returnAllIndexValuesArrayList(arr, target, 0,new ArrayList<>()));
        System.out.println(returnAllIndexValuesArrayList2(arr, target, 0));
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

    static ArrayList<Integer> returnAllIndexValuesArrayList(int[] arr,int target,int index,ArrayList<Integer> list) {
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
    
        return returnAllIndexValuesArrayList(arr, target, index+1,list); 
    }
    static ArrayList<Integer> returnAllIndexValuesArrayList2(int[] arr,int target,int index) {
        ArrayList<Integer> list = new ArrayList<>();
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
    
        ArrayList<Integer> ansfromBelowCalls = returnAllIndexValuesArrayList2(arr, target, index+1); 
        list.addAll(ansfromBelowCalls);
        return list;
    }
}
