package OOPS.Day5;

public class Son extends Parent {
    int age;
    Son(int age){
        this.age = age;
    }

    void age(){
        System.out.println("my ge is " +this.age);
    }

    void normal(){
        super.normal();
    }
    void career(){
        System.out.println("Im gonna be a neonatologist");
    }

    void partner(){
        System.out.println("hell yeah");
    }
}
