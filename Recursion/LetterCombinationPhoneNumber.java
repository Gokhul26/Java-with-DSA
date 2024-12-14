package Recursion;
import java.util.ArrayList;

public class LetterCombinationPhoneNumber {
    public static void main(String[] args) {
        // System.out.println(lettersList("", "23"));
        System.out.println(lettersCount("", "23"));
    }

    static void letters(String processed, String unprocessed){
        if(unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }

        int digits = unprocessed.charAt(0) - '0';

        for (int i = (digits - 1)* 3; i < digits * 3; i++) {
            char ch = (char) ('a' + i);
            letters(processed+ ch, unprocessed.substring(1));
        }
    }

    static ArrayList<String> lettersList(String processed, String unprocessed){
        if(unprocessed.isEmpty()){
           ArrayList<String> list = new ArrayList<>();
           list.add(processed);
           return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        int digits = unprocessed.charAt(0) - '0';


        for (int i = (digits - 1)* 3; i < digits * 3; i++) {
            char ch = (char) ('a' + i);
            ans.addAll(lettersList(processed+ ch, unprocessed.substring(1)));
        }
        return ans;
    }

    static int lettersCount(String processed, String unprocessed){
        if(unprocessed.isEmpty()){
            // System.out.println(processed);
            return 1;
        }
        int count = 0;
        int digits = unprocessed.charAt(0) - '0';

        for (int i = (digits - 1)* 3; i < digits * 3; i++) {
            char ch = (char) ('a' + i);
            count = count + lettersCount(processed+ ch, unprocessed.substring(1));
        }
        return count;
    }

}
