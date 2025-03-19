public class rgbSmurfs {
    public static void main(String[] args) {
        char[] arr = {'R', 'R', 'R', 'R', 'R'};
        int rCount = 0;
        int gCount = 0;
        int bCount = 0;
        
        int n = arr.length;
        
        for(char ch : arr){
            if(ch == 'R') rCount++;
            else if(ch == 'G') gCount++;
            else{
                bCount++;
            }
        }
        int ans = 0;
        if((rCount == n) || (gCount == n) || (bCount == n)){
            ans = n;
        }else{
            int oddcount = 0;
    
            if(rCount % 2 == 1) oddcount++;
    
            if(gCount % 2 == 1) oddcount++;
    
            if(bCount % 2 == 1) oddcount++;
    
            ans = oddcount == 1 ? 1 : 2;
        }
        System.out.println(ans);
    }

    
}
