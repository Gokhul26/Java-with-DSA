// inline example is added here

package OOPS.Day3.Polymorphism;

public class sumation {
    int sum(int a , int b){
        return a + b;
    }

    int sum(int a , int b, int c){
        return a + b + c;
    }

    void area(){
        System.out.println("ooo");
    }

    public static void main(String[] args) {
        sumation obj = new sumation();
        sumation ob1 = new sq();
        ob1.area();


        // obj.sum(2, 1);
        // System.out.println(obj.sum(2, 01, 01));
    }
}

// Example for inlining
class Example {
    public final int getValue() {
        return 5;
    }

    public int compute() {
        return getValue() * 2;
    }

}

//With inlining, instead of the JVM making a call to getValue() in the compute method, it might replace the call with the constant 5 directly, transforming compute() to something like this internally:

// public int compute() {
//     return 5 * 2;
// }

//This results in faster execution because there is no need to perform an actual method call.
