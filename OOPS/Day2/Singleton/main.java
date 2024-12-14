package OOPS.Day2.Singleton;

public class main {
    public static void main(String[] args) {
        singleton obj = singleton.getInstance();
        // only one object will be created, all the objects will be pointed to the same instance
        singleton obj1 = singleton.getInstance();
        singleton obj2 = singleton.getInstance();
    }
}
