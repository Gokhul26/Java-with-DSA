package OOPS.Day3;

public class BoxColor extends BoxSide{
    String color;
    BoxColor(double side, double width, double tright, double fb, String color){
        super(side, width, tright, fb);
        this.color = color;
        System.out.println(super.length);

    }
    
}
