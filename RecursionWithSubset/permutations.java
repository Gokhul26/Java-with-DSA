package RecursionWithSubset;
import java.util.ArrayList;

public class permutations {
    public static void main(String[] args) {
        // ArrayList<String> answer = permList("", "abc");
        // System.out.println(answer);
        System.out.println(permCount("", "abc"));
    }

    static void perm(String processed, String unprocessed){
        if(unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }
        char ch = unprocessed.charAt(0);
        for (int i = 0; i <= processed.length(); i++) {
            String first = processed.substring(0,i);
            String second = processed.substring(i, processed.length());
            perm(first + ch + second, unprocessed.substring(1));
        }
    }

    static ArrayList<String> permList(String processed, String unprocessed){
        if(unprocessed.isEmpty()){
            ArrayList<String> ans = new ArrayList<>();
            ans.add(processed);
            return ans;
        }
        char ch = unprocessed.charAt(0);
        ArrayList<String> list = new ArrayList<>();
        
        for (int i = 0; i <= processed.length(); i++) {
            String first = processed.substring(0,i);
            String second = processed.substring(i, processed.length());
            list.addAll(permList(first + ch + second, unprocessed.substring(1)));
        }
        return list;
    }

    // static int permCount(String processed, String unprocessed){
    //     if(unprocessed.isEmpty()){
    //         // System.out.println(processed);
    //         return 1;
    //     }
    //     char ch = unprocessed.charAt(0);
    //     int count = 0;
    //     for (int i = 0; i <= processed.length(); i++) {
    //         String first = processed.substring(0,i);
    //         String second = processed.substring(i, processed.length());
    //         count = count + permCount(first + ch + second, unprocessed.substring(1));
    //     }
    //     return count;
    // }
}
