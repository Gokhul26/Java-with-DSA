package OOPS.Day5;

public class Emp{
    public static void main(String[] args) {
        Client c = new Client(1, "goks", 2, "gokhul", 3, "pentonic");
        c.displey();
            }
        }
        class Employee {
            int eno;
            String ename;
        
            public Employee(int eno,String ename ){
                this.ename = ename;
                this.eno = eno;
                System.out.println("Employee");
            }
        }
        
        class Manager extends Employee{
            int mno;
            String mname;
        
            public Manager(int eno, String ename, int mno, String mname){
                super(eno, ename);
                this.mno = mno;
                this.mname = mname;
                System.out.println("Manager");
            }
        }
        
        class Client extends Manager{
            int cno;
            String cname;
        
            public Client(int eno, String ename, int mno, String mname, int cno, String cname){
                super(eno, ename, mno, mname);
                this.cname = cname;
                this.cno = cno;
                System.out.println("client");
            }
        
            public void displey() {
                // new UnsupportedOperationException("Unimplemented method 'displey'");

                System.out.println("Emp no:"+ eno);
                System.out.println("Emp name:"+ ename);
                System.out.println("client no:"+ cno);
                System.out.println("client name:"+ cname);
                System.out.println("Manager no:"+ mno);
                System.out.println("Manager name:"+ mname);
            }
}

