package RecursionWithSubset;
import java.util.ArrayList;


public class SubSeq {
    public static void main(String[] args) {
        ArrayList<String> ans = subseqarrList("", "abc");
        // subseqarrList("", "abc");
        System.out.println(ans);
    }

    static void subseq(String proceesed, String unprocessed){
        if(unprocessed.isEmpty()){
            System.out.println(proceesed);
            return;
        }
        char ch = unprocessed.charAt(0);
        subseq(proceesed + ch , unprocessed.substring(1));
        subseq(proceesed, unprocessed.substring(1));
    }
    static ArrayList<String> subseqarrList(String processed,String unprocessed){
        if(unprocessed.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }

        char ch = unprocessed.charAt(0);

        ArrayList<String> left = subseqarrList(processed + ch, unprocessed.substring(1));
        ArrayList<String> right = subseqarrList(processed , unprocessed.substring(1));
        //ArrayList<String> ascii = subseqarrList(processed + (ch + 0), unprocessed.substring(1));

        left.addAll(right);
        // left.addAll(ascii);
        return left;
    }
}