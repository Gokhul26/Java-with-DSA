package Microsoft;

public class Sum1 {
                        // you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

                    // you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A, int[] B) {
        // Implement your solution here
        int n = A.length;
        if( n == 1){
            return Math.min(A[0], B[0]);
        }

        int[] maximumPathOfA = new int[n];
        int[] maximumPathOfB = new int[n];

        maximumPathOfA[0] = A[0];
        maximumPathOfB[0] = Math.max(A[0], B[0]);

        for(int i = 1; i < n ;i++){
            maximumPathOfA[i] = Math.min(Math.max(maximumPathOfA[i - 1], A[i]), Math.max(maximumPathOfB[i - 1], A[i]));

            maximumPathOfB[i] = Math.min(Math.max(maximumPathOfA[i ], B[i]), Math.max(maximumPathOfB[i - 1], B[i]));
        }
        return maximumPathOfB[n - 1];
    }
}
                            
                            
}
