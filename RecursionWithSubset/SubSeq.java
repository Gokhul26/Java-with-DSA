package RecursionWithSubset;


public class SubSeq {
    public static void main(String[] args) {
        subseq("", "abc");
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
}