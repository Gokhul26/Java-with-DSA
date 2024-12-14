package OOPS.Day2;

public class StaticBlock {
    static int a = 10;
    static int b;

    static{
        System.out.println("Im in static blockl");
        b = a * 10;
    }

    public static void main(String[] args) {
        // StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);
    }
}