package StringBuffer;

import java.text.DecimalFormat;
import java.util.Arrays;

public class removeWhiteSpaces {
    public static void main(String[] args) {
        String a = "sfivbv sibvdsgvudv juab fguie sv";
        String b = "sfivbv,sibvdsgvudv,juab,fguie,sv";
        System.out.println(a.replaceAll("\\s",""));

        String[] arr = b.split(",");
        String[] arr1 = a.split("");
        // this will split the array where there are spaces
        System.out.println(Arrays.toString(arr));

        //Rounding off

        DecimalFormat df = new DecimalFormat("00.00000");
        System.out.println(df.format(4.5));
    }
}
