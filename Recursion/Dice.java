package Recursion;
import java.util.ArrayList;
public class Dice {
    public static void main(String[] args) {
        System.out.println(diceCustomFace("", 6,  8));
    }

    static ArrayList<String> dice(String procssed, int target){
        if(target == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(procssed);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();

        for (int i = 1; i <= 6 && i<= target; i++) {
            ans.addAll(dice(procssed + i, target - i));
        }
        return ans; 
    }

    static ArrayList<String> diceCustomFace(String procssed, int target,int face){
        if(target == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(procssed);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();

        for (int i = 1; i <= face && i<= target; i++) {
            ans.addAll(diceCustomFace(procssed + i, target - i,face));
        }
        return ans; 
    }
}
