package Microsoft;

public class pseudoBinary {
    public static void main(String[] args) {
        int num = 423;
        func(num);
    }

    // static void func(int num){
    //     int pv, construct, digit;
    //     while(num > 0){
    //         int temp = num;
    //         pv = 1;
    //         construct = 0;
    //         while(temp >  0){
    //             digit = temp % 10;
    //             if(digit > 0){
    //                 construct = pv + construct;
    //             } 
    //             temp /= 10;
    //             pv *= 10;
    //         }

    //         // System.out.print(construct);
    //         num = num - construct;

    //         if(num == 0){
    //             System.out.print(construct);
    //         }else{
    //             System.out.print(construct + "+");
    //         }
    //     }
    // }


    static void func(int num){
        int pv,construct , digit;
        while(num > 0){
            pv = 1;
            construct = 0;
            int temp = num;
            while(temp > 0){
                digit = temp % 10;
                if(digit > 0 ){
                    construct = pv + construct;
                }
                pv *= 10;
                temp /= 10;
            }
                num = num - construct;

                if(num == 0){
                    System.out.println(construct);
                }else{
                    System.out.print(construct + "+");
                }
            }
        }

        
    }

