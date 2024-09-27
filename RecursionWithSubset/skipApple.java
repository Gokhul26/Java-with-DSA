package RecursionWithSubset;

public class skipApple {
    public static void main(String[] args) {
        // System.out.println(skipApple("isGoodapple"));
        System.out.println(skipAppNotApple("ojefbhvuappl"));
    }

    static String skipApple(String a){
        if(a.isEmpty()){
            return "";
        }

        if(a.startsWith("apple")){
            return skipApple(a.substring(5));
        }else{
            return a.charAt(0) + skipApple(a.substring(1));
        }
    }

    static String skipAppNotApple(String a){
        if(a.isEmpty()){
            return "";
        }

        if(a.startsWith("app") && !a.startsWith("apple")){
            return skipAppNotApple(a.substring(3));
        }else{
            return a.charAt(0) + skipAppNotApple(a.substring(1));
        }
    }
}