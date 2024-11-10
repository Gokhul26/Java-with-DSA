public class reverseString {
    // public static void main(String[] args) {
    //     String a = "goks";
    //     System.out.println(reverseStringg(a));
    // }

    // private static String reverseStringg(String str){
    //     StringBuilder reverse = new StringBuilder();
    //     for (int i = str.length() - 1 ; i>=0; i--){
    //         reverse.append(str.charAt(i));
    //     }
    //     return reverse.toString();
    // }


    //OR


    public static void main(String[] args) {
        String a = "goks";
        String reversed = new StringBuilder(a).reverse().toString();
        System.out.println(reversed);
    }
}
