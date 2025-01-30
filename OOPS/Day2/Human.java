package OOPS.Day2;

public class Human {
    int age;
    int rno;
    String gender;
    boolean married;
    String name;
    int salary;
    static int population ;

    // public Human(int age, boolean married, String name, int salary) {
    //     this.age = age;
    //     this.married = married;
    //     this.name = name;
    //     this.salary = salary;
    //     Human.population += 1;
    // }

    // Constructor chaining
    // in constructor chaining, the constructor calling(this) should be called first
    // public Human() {
    //     this(96,"Goks");
    //     System.out.println("This is the first default constructor calling");
    // }

    //copy constructor
    public Human(int rno, String name){
        // this("male");
        this.rno = rno;
        this.name = name;
        System.out.println("My rno is "+this.rno+ " || My name is "+this.name);

    }
    public Human(Human obj){
        this.rno = obj.rno;
        System.out.println("Roll No is " + obj.rno );
    }
}
