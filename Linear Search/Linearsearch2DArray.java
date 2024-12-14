
import java.util.Arrays;

public class Linearsearch2DArray {
    public static void main(String[] args) {
        int[][] arr = {
            {1,3,6,},
            {7,8,9},
            {0}
        };
        int target = 0;
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int[][] arr,int target){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target){
                    return new int[] {row+1,col+1};
                }          
            }
        }
        return new int[] {-1,-1};
    }
}


// public class Linearsearch2DArray {
//     public static void main(String[] args) {
//         int[][] arr = {
//             {1,2,3},
//             {5,6,7,8},
//             {9}
//         };
//         int target = 8;
//             int[] ans = search(arr , target);
//             System.out.println(Arrays.toString(ans));
//     }
//     static int[] search(int[][] arr,int target){
//         for (int r = 0; r < arr.length; r++) {
//             for (int c = 0; c < arr[r].length; c++) {
//                 if(arr[r][c]==target){
//                     return new int[] {r+1,c+1};
//                 }
//             }
//         }
//     return new int[] {-1,-1};
//     }
// }