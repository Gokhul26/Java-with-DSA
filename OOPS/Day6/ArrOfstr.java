package OOPS.Day6;

public class ArrOfstr {
    public static void main(String[] args) {
        String arr[] = {"100", "200", "GOKS", "3.5", "789"};

        int invalid = 0,count = 0,num;
        for (int i = 0; i < arr.length; i++) {
            try{
                num = Integer.parseInt(arr[i]);
            }catch(NumberFormatException e){
                invalid += 1;
                System.out.println(e.getMessage());
                System.out.println("invalid value " + arr[i]);
                continue;
            }
            count+=1;
        }
        System.out.println("Count = " + count);
        System.out.println("Invalid = " + invalid);
    }
}
