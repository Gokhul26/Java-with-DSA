package OOPS.Day1;

// import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Student goks = new Student(45,"gokhul.D",45.3f);
        
        Student gokhul = new Student();
        gokhul.name = "Pentonic";
        System.out.println(gokhul.name);


        goks.rollNo = 96;
        goks.mark = 56.5f;
        System.out.println(goks.name);
        System.out.println(goks.rollNo);
        System.out.println(goks.mark);
        goks.changeName("GOKS");
        goks.greeeting();


        Student random = new Student(goks);
        System.out.println(random.name);


        Student empty = new Student();
        System.out.println(empty.name);

        Student one = new Student();
        Student two = one;
        one.name = "Goppu";
        System.out.println(two.name);

        A obj;

        for (int i = 0; i < 1000000; i++) {
            obj = new A("Goks");   
        }
    }

    public static void greeting(){
        System.out.println("WELCOME");
    }    
}

class Student{
    int rollNo;
    String name;
    float mark;

    void greeeting(){
        System.out.println("HEY WWLCOEM MY NAME IS " + name);
    }

    void changeName(String newName){
        name = newName;
        this.greeeting();
    }
    Student(int roll, String naam, float marku){
        this.name = naam;
        this.rollNo = roll;
        this.mark = marku;
    }

    Student(){
        this(56,"ALEX",67.9f);
    }

    Student(Student other){
        this.name = other.name;
        this.rollNo = other.rollNo;
        this.mark = other.mark;
    }
}

class A{
    String name;

    A(String name){
        this.name = name;
    }

    //Any objects from the class A gets deleted: this finalize will be called.
    @Override
    protected void finalize() throws Throwable {
        // TODO Auto-generated method stub
        // super.finalize();
        System.out.println("Objwct is deleted");
    }
}