package OOPS.Day3;

public class BoxSide extends Box {

    double width, size;
   

    BoxSide(){
        this.width = -1;
    }

    BoxSide(double length,double weight,double height,double width){
        super(length,weight,height);
        this.width = width;
    }

    BoxSide(double length, double weight, double size){
        super(length,weight);
        this.size = -1;
    }
    
}
