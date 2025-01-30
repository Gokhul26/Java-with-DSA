package OOPS.Day4;

public class accessModifiers {
    int num, age;
    protected int nums =10;

    public accessModifiers(int num, int age){
        this.num = num;
        this.age = age;
    }
}


class ObjectClass{
    int num;
    float a;
    ObjectClass(int num, float a){
        this.num = num;
        this.a = a;
    }
    public boolean equals(Object obj) {
        return this.num == ((ObjectClass)obj).num;
     }
  
    public static void main(String[] args) {
        ObjectClass obj = new ObjectClass(3,4.5f);
        ObjectClass obj2 = new ObjectClass(3,4.9f);

        if(obj.equals(obj2)){
            System.out.println("obj 1 is equal to 2");
        }else{
            System.out.println("JHHVH");
        }

    }
}