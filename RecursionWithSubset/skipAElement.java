package RecursionWithSubset;

public class skipAElement {
    public static void main(String[] args) {
        // String myGirl = "navinaa";
        // skip("", "Navinaa");
        System.out.println(skip1("Navinaa"));

    }
    static void skip(String processed, String unprocessed){
        if(unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }

        char ch = unprocessed.charAt(0);

        if(ch == 'a'){
            skip(processed, unprocessed.substring(1));
        }else{
            skip(processed+ch,unprocessed.substring(1));
        }
    }

    static String skip1(String p){
        if(p.isEmpty()){
            return "";
        }

        char ch = p.charAt(0);

        if(ch == 'a'){
            return skip1(p.substring(1));
        }else{
            return ch + skip1(p.substring(1));
        }
    }
}
