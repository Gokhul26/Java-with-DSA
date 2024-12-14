package OOPS.Day7;

public class enumExample {

    // enums cant extend classes but it can inherit interfaces.
    enum Week implements A{
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
        //these are enum constants
        //they are static, final and public
        //they cant be inherited
        // this is type of Week

        Week(){
            System.out.println("Constructor for "+ this);
            // this is not public or protected, its default or private
            // coz we dont wanna create new objects coz thats not enum concept
        }
        public void fun(){
            System.out.println("HEY");
        }
    }

    public static void main(String[] args) {
        Week week = Week.Friday;

        // for(Week day : Week.values()){
        //     System.out.println(day);
        // }
        week.fun();
        System.out.println(week);

        System.out.println(week.ordinal());
    }
}
