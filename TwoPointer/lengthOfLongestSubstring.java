package TwoPointer;
import java.util.HashSet;
import java.util.Set;
// longest substring withoiut repeating characters
public class lengthOfLongestSubstring {
    public static void main(String[] args) {
        String s = "aabcdbbbcd";
        System.out.println(lenght(s));
    }
    static int lenght(String s){
        int l = 0,r = 0,maxLength = 0;
        Set<Character> set = new HashSet<>();
        while( r < s.length()){
            if(!set.contains(s.charAt(r))){
                set.add(s.charAt(r));
                r++;
                maxLength = Math.max(maxLength, set.size());
            }else{
                set.remove(s.charAt(l));
                l++;
            }
        }
        return maxLength;
        
    }
    
}
