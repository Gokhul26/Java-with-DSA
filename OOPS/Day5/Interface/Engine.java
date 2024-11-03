package OOPS.Day5.Interface;

public class Engine implements Car, Bike {

    @Override
    public void accelerate() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Im acceleratring the car'");
    }

    @Override
    public void brake() {
        // TODO Auto-generated method stub
       System.out.println(" Im applying brake'");
    }
    
}
