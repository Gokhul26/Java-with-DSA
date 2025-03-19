package Patterns;

public class Pattern1 {
    public static void main(String[] args) {
        // pattern1(6);
        pattern13(5);
    }   
    
    static void pattern1(int n ){
        for (int row = 1;row<=n;row++){
            for(int col = 1;col<=row;col ++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern2(int n ){
        for(int row = 1;row<=n;row++){
            for(int col = 1;col<=n;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern3(int n ){
            for (int row = 1;row<=n;row++){
                for(int col = 1;col<= n-row+1;col ++){
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    
    static void pattern4(int n ){
        for (int row = 1;row<=n;row++){
            for(int col = 1;col<=row;col ++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }

    static void pattern5(int n ){
        for(int row = 1;row<= 2*n -1;row++){
            int TotalNoOfColums = row > n ? 2*n - row : row;
            for(int col = 1;col<= TotalNoOfColums;col++){
                System.out.print(col + " ");
                // System.out.print("* ");
            }
            System.out.println();
        }}

        static void pattern6(int n ){
            for(int row = 1;row<= 2*n -1;row++){
                int TotalNoOfColums = row > n ? 2*n - row : row;

                int totalNoOfspaces = n - TotalNoOfColums;
                for(int space = 0;space<totalNoOfspaces;space++){
                    System.out.print(" ");
                }
                for(int col = 1;col<= TotalNoOfColums;col++){
                    System.out.print(col + " ");
                    // System.out.print("* ");
                }
                System.out.println();
            }}

        static void pattern7(int n ){
            for(int row = 1;row<= n;row++){
                int totalNoOfspaces = n - row;;
                for(int space = 0;space<totalNoOfspaces;space++){
                    System.out.print("  ");
                }
                for(int col = row;col >= 1;col--){
                    System.out.print(col + " ");
                }
                for(int col = 2;col <= row;col ++){
                    System.out.print(col + " ");
                }
                System.out.println();
            }}
        
        static void pattern8(int n ){
            for(int row = 1;row<= 2*n - 1;row++){
                int totalNoOfColums = row > n ? 2*n - row : row;
                for(int space = 0;space<n - totalNoOfColums;space++){
                    System.out.print("  ");
                }
                for(int col = totalNoOfColums;col >= 1;col--){
                    System.out.print(col + " ");
                }
                for(int col = 2;col <= totalNoOfColums;col ++){
                    System.out.print(col + " ");
                }
                System.out.println();
            }}
        static void pattern9(int n ){
            n = 2*n;
            for (int row = 0; row <= n; row++) {
                for(int col = 0 ;col<=n ;col++){
                    int atEveryIndexValue = Math.min(Math.min(col,row), Math.min(n-col,n-row));
                    System.out.print(atEveryIndexValue+ " ");
                }
                System.out.println();
            }
        }
        // static void pattern14(int n){
        //     int  originalN = n;
        //     n = 2*n;
        //     for (int row = 0; row <= n; row++) {
        //         for(int col = 0 ;col<= n ;col++){
        //             int atEveryIndexValue = originalN - Math.min(Math.min(col,row), Math.min(n-col,n-row));
        //             System.out.print(atEveryIndexValue+ " ");
        //         }
        //         System.out.println();
        //     }
        // }
        static void pattern11(int n) {
            int originalN = n;
            n = 2 * n;
            for (int row = 0; row <= n; row++) {
                for (int col = 0; col <= n; col++) {
                    int atEveryIndexValue = originalN - Math.min(Math.min(col, row), Math.min(n - col, n - row));
                    // Replace zero with 1
                    if (atEveryIndexValue == 0) {
                        atEveryIndexValue = 1;
                    }
                    System.out.print(atEveryIndexValue + " ");
                }
                System.out.println();
            }
        }
        static void pattern13(int n) {
            int originalN = n;
            n = 2 * n - 1;  // Adjust size to control the number of rows and columns
            
            for (int row = 0; row < n; row++) {
                for (int col = 0; col < n; col++) {
                    int atEveryIndexValue = originalN - Math.min(Math.min(col, row), Math.min(n - col - 1, n - row - 1));
                    System.out.print(atEveryIndexValue + " ");
                }
                System.out.println();
            }
        }

        static void pattern14(int n ){
            // pascal triangle
            for (int i = 0; i < n; i++) {
                int value = 1;
                for (int j = 0; j <= 1; j++) {
                    System.out.println(value);
                    
                }
                
            }
        }
        
    }       

