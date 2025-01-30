//create a interface MECT

// create a class CSE and default method subject with subject details
// create a class IT and default method subject  with subject details

// use interface to print different department subjects.

package OOPS.Day5.Interface.MCET;

interface Mcet1 {  
    void display();
}

class CSE implements Mcet1{
    public void display(){
        System.out.println();
    }

}

class IT implements Mcet1{
    public void display(){
        System.out.println("fcgvhbj");
    }
}

public class MCET1{
    public static void main(String[] args) {
        IT i = new IT();
        i.display();
        
    }

}
