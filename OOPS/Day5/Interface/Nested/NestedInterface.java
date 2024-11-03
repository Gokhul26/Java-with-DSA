package OOPS.Day5.Interface.Nested;

public class NestedInterface {

    protected interface Example{
        boolean isOdd(int num);
    }
}

class B implements NestedInterface.Example{

    @Override
    public boolean isOdd(int num) {
        return (num & 1) == 1;
    }
    
}
