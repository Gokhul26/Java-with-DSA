package OOPS.Day2;

public class Main {
    public static void main(String[] args) {
        Human goks = new Human(18, false, "Gokhul", 123455);
        Human gokhul = new Human(18, false, "Gokhul", 123455);
        System.out.println(Human.population);
        
        Main obj = new Main();
        
        obj. fun1();
    }

    void fun1(){
        fun();
    }

    void fun(){
        System.out.println("vevv");
    }
}
