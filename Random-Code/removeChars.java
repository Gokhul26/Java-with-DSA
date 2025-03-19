import java.util.*;;

public class removeChars {
    public static void main(String[] args) {
        String str = "goks";
        String remove = "ks";

        char[] arr = str.toCharArray();

        HashSet<Character> set = new HashSet<>();

        for (Character character : remove.toCharArray()) {
            set.add(character);
        }

        for (int i = 0; i < arr.length; i++) {
            if(set.contains(arr[i])){
                arr[i] = '\0';
            }
        }

        System.out.println(new String(arr));
    }
}
