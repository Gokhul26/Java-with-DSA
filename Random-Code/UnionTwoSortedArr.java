import java.util.ArrayList;
import java.util.HashSet;

public class UnionTwoSortedArr {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,5,5,7};
        int[] arr2 = {5,6,7,7,8,8,9};

        ArrayList<Integer> list = func(arr, arr2);


        System.out.println(list);
    }

    private static ArrayList<Integer> func(int[] arr, int[] arr2){
        
        ArrayList<Integer> list = new ArrayList<>();
    
        HashSet<Integer> set1 = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            set1.add(arr[i]);
        }

        for (int i = 0; i < arr2.length; i++) {
            set1.add(arr2[i]);
        }

        for (int num : set1) {
            list.add(num);
        }

        return list;
    }


    
}
