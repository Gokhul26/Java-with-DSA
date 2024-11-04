package Microsoft;

public class reversePosition {
    public static void main(String[] args) {
        int num = 857463;
        int position = 3;
        System.out.print(num + "->");
        System.out.println(reverse(num, position));
    }

    static int reverse(int num, int position){
    //     int pv = 1, digit, rev = 0;
    //     while(position-- > 0){
    //         pv = pv* 10;
    //     }

    //     int part = num % pv;

    //     while(part != 0){
    //         digit = part % 10;
    //         rev = rev*10 + digit;
    //         part /= 10;
    //     }

    //     num = (num/pv)*pv + rev;
    //     return num;
    // }

    int pv = 1, rev = 0, digit;
    while (position-- > 0){
        pv *= 10;
    }

    int part = num % pv;

    while(part!=0){
        digit = part %10;
        rev = rev*10 + digit;
        part/=10;
    }

    num = (num/pv) * pv + rev;
    return num;


    }}
