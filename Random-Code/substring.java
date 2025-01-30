import java.util.Scanner;

public class substring {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String text = s.nextLine();
        String substring = s.nextLine();
        if(isSubstring(text, substring)){
            System.out.println("SUBSTRING IS PRESENT");
        }else{
            System.out.println("NOT PRESENT");
        }

    }

    public static boolean isSubstring(String str1, String str2){
        int len1 = str1.length();
        int len2 = str2.length();

        if(len2 > len1){
            return false;
        }

        //len1 - len2: The last possible starting index in str1 where str2 can fit completely.
        for (int i = 0; i <= len1 - len2; i++) {
            int j;
            for (j = 0; j < len2; j++) {
                if(str1.charAt(i+j)!= str2.charAt(j)){
                    break;// breaks the for loop
                }
            }

            if(j == len2){
                return true;
            }
        }

        return false;
    }
}
