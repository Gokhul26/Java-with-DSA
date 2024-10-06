package StringBuffer;

public class Buffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("GOks ");
        // String ans = "Gokhul";
        // System.out.println(ans);
        // it appends it, but doesnot create a new object
        // sb.append("dood ");
        // sb.append("is cool");
        // sb.insert(4, " aka ");
        sb.replace(1, 3, "okhul");
        sb.delete(3, 7);
        System.out.println(sb.capacity());
        sb.reverse();

        System.out.println(sb);
        
        
       
       
       
        // System.out.println(sb);
        // String str = sb.toString();
        // System.out.println(str);

        StringBuffer name = new StringBuffer(32);
        System.out.println(name.capacity());
        // System.out.println(name);
    }
}
