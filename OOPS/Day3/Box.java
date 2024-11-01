package OOPS.Day3;

class Box {
    protected double length;
    double height;
    double weight;
    Box(double length, double height, double weight) {
        this.length = length;
        this.height = height;
        this.weight = weight;
    }  

    Box(){
        this.height = -1;
        this.weight = -1;
        this.length = -1;
    }

    Box(Box other){
        this.height = other.height;
        this.weight = other.weight;
        this.length = other.length;
    }

    Box(double side){
        this.length = side;
        this.weight = side;
        this.height = side;
    }

    Box(double length, double weight){
        this.length = length;
        this.weight = weight;
    }

}
