//Longest plaindromic substring //O(N^3)

import java.util.ArrayList;

public class substringGenerate {
    public static void main(String[] args) {
        String str = "aabbaacd";
        ArrayList<String> subStrings = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                String substring = str.substring(i,j);
                subStrings.add(substring);
            }
        }

        for (String substring : subStrings){
            System.out.println("Length of "+substring+" is "+ substring.length() );
        }

        String longestPalindrome = "";
        for (String substring : subStrings){
            if(isPalindrome(substring) && substring.length() > longestPalindrome.length()){
                longestPalindrome = substring;
            }
        }

        System.out.println("Longest Palindrome Substring is "+longestPalindrome);
    }
    public static boolean isPalindrome(String substring){
            int left = 0;
            int right = substring.length() - 1;
            while(left < right){
                if(substring.charAt(left) != substring.charAt(right)){
                    return false;
                }
                left ++;
                right --;
            }
            return true;
    }
}
