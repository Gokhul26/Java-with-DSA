package OOPS.Day3;

import OOPS.Day4.accessModifiers;

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


class demo extends accessModifiers{
    int num,sum;
    demo(int num, int sum){
        super(num,sum);
        
    }

    public static void main(String[] args) {
        demo a = new demo(3, 2);
        int b = a.nums;

    }
}


