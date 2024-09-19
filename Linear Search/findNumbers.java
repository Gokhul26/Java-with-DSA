public class findNumbers {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,56};
        System.out.println(findnumbers(nums)); 
     }
    static int findnumbers(int[] nums){
        int count = 0;
        for (int num : nums){
            if (even(num)){
                count++;

            }
        }
        return count;
    }

    static boolean even(int num){
        int numberofDigits = digits1(num);
        // if(numberofDigits %2 == 0){
        //     return true;
        // }     
        // return false;
        return numberofDigits % 2 ==0;
    }

    
    // static int digits(int num){
    //     int count = 0 ;
    //     while (num > 0 )
    //     {
    //         count ++;
    //         num = num/ 10;
    //     }
    //     return count;
    // }
    static int digits1(int num){
        return (int) (Math.log10(num)) + 1;


    }
}
