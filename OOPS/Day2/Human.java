package OOPS.Day2;

public class Human {
    int age;
    boolean married;
    String name;
    int salary;
    static int population ;

    public Human(int age, boolean married, String name, int salary) {
        this.age = age;
        this.married = married;
        this.name = name;
        this.salary = salary;
        Human.population += 1;
    }

    public Human(int age) {
        this.age = age;
    }

    
    
}
