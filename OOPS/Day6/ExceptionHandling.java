package OOPS.Day6;

public class ExceptionHandling {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        try{
            String name = "GOKS";
            if(name.equals("GOKS")){
                throw new MyException(name);
            }
            divide(a,b);
                    }catch(Exception e){
                        System.out.println(e.getMessage());
                    }finally{
                        System.out.println("this will always execute");
                    }
                }
            
                private static int divide(int a, int b) throws ArithmeticException {
                   if(b == 0){
                    throw new ArithmeticException("dont divide by zero");
                   }

                   return a / b;
                }
}
