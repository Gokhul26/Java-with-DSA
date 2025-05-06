package RecursionStriver;

public class subsequence {
    public static void main(String[] args) {
        String str = "abc";
        generateSub(str, "", 0);
    }

    private static void generateSub(String up, String p, int index){
        if(index == up.length()){
            System.out.println(p);
            return;
        }

        generateSub(up, p+up.charAt(index), index+1);

        generateSub(up, p, index+1);
    }
}
