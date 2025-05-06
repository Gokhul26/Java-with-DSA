package Thread;
class Gokhul extends Thread{
    public void run(){
        for (int index = 0; index < 10; index++) {
            System.out.println("Hey");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class BB extends Thread{
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("BB->" + i);
            try {
                Thread.sleep(10);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    public void print(){
        for (int i = 0; i < 3; i++) {
            System.out.println("How are you");
        }
    }
}
public class simple {
    public static void main(String[] args) {
        Gokhul g = new Gokhul();
        BB b = new BB();
        g.start();
        b.print();
        b.start();

    }
}
