package OOPS.Day6;

public class comparison implements Comparable<comparison> {
    int roll;
    float marks;

    public comparison(int roll, float marks) {
        this.roll = roll;
        this.marks = marks;
    }

    @Override
    public int compareTo(comparison arg0) {
        int diff = (int) (this.marks - arg0.marks);
        // TODO Auto-generated method stub
        return diff;

        // return Float.compare(this.marks, arg0.marks);
    }

    public static void main(String[] args) {
        comparison goks = new comparison(96,45.7f);
        comparison gokhul = new comparison(87, 96f);

        if(goks.compareTo(gokhul) > 0){
            System.out.println("Goks has more marks");
        }else{
            System.out.println("Gokhul has more marks");
        }
    }

    }

