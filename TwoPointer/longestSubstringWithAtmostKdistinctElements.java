//https://leetcode.com/problems/longest-substring-with-at-most-k-distinct-characters/description/

import java.util.HashSet;
import java.util.Set;

public class longestSubstringWithAtmostKdistinctElements {
    public static void main(String[] args) {
        String a = "taaabbbbcccc";
        int k = 2;
        System.out.println(func1(a,k));
    }
    static int func1(String str, int k){
        int maxLength = 0;
        Set<Character> set = new HashSet<>();
        int left = 0,right = 0;
        while(right< str.length()){
            set.add(str.charAt(right));
            if(set.size()>k){
                set.remove(str.charAt(left));
                left++;
                set.clear();
                for (int i = left; i <= right; i++) {
                    set.add(str.charAt(i));
                    
                }
            }else{
                int length = right - left + 1;
                maxLength = Math.max(length, maxLength);
            }
            right++;
        }
        return maxLength;
    }
}
