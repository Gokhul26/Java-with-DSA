package OOPS.Day6;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(34);
        daughter girl = new daughter(30);
        son.age();
        son.partner();
        Parent.greeting();
        girl.partner();
        son.normal();
    }
}
