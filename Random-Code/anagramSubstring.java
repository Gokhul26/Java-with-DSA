import java.util.Arrays;

public class anagramSubstring {
    public static void main(String[] args) {
        String str = "aabaabaa";

        int len1 = str.length();

        String anagram = "aaba";

        String sortedA = sort(anagram);

        int len2 = anagram.length();

        int size =  len1 - len2;

        int count = 0;

        for (int i = 0; i <= size; i++) {
            String subStr = str.substring(i, len2 + i);

            if(sort(subStr).equals(sortedA)){
                count++;
            }
        }

        System.out.println("No of occurence of anagrams: "+count);;
        
    }

    private static String sort(String s){
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
}

