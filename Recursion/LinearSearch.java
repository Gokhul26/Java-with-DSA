package Recursion;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {4,3,5,6,7};
        int target = 4;
        // System.out.println(searchInt(arr, target, 0));
        // System.out.println(search(arr, target,0));
        System.out.println(searchIntLast(arr, target, arr.length - 1));

    }
    static boolean search(int[] arr, int target, int index){
        if(index == arr.length){
            return false;
        }

        return arr[index] == target || search(arr, target, index  +1);
    }
    static int searchInt(int[] arr, int target, int index){
        if(arr[index] == target){
            return index + 1;
        }
        if(index == arr.length){
            return -1;
        }
        else{
            return searchInt(arr, target, index+1);
        }}

    static int searchIntLast(int[] arr, int target, int index){
        if(arr[index] == target){
            return index + 1;
        }
        if(index == -1){
            return -1;
        }
        else{
            return searchIntLast(arr, target, index-1);
        }
    
    }
    }
