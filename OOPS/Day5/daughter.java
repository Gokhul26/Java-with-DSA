package OOPS.Day5;

public class daughter extends Parent {

    daughter(int age){
        this.age = age;
    }
    @Override
    void career(){
        System.out.println("I'm gonna be a Doctor");
    }
    @Override
    void partner(){
        System.out.println("I'm gonna marry jim Halpert");
    }

    
}