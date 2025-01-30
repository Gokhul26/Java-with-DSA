package OOPS.Day4;

public class Subclass extends accessModifiers{

    Subclass(int num, int age){
        super(num, age);
    }
    public static void main(String[] args) {
        Subclass obj = new Subclass(2,3);
        int n = obj.nums;
        System.out.println(obj instanceof accessModifiers);
        System.out.println(obj instanceof Object);
        System.out.println(obj instanceof Subclass);
        System.out.println(obj.getClass());
    }
}

class Subsubclass extends Subclass{

    Subsubclass(int num, int age){
        super(num, age);
    }

    public static void main(String[] args) {
        Subsubclass a = new Subsubclass(9,2);
        int b = a.nums;
        
    }
    
}
