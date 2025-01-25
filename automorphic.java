// **** IMPORTANT ****
// KEEP THIS MAIN CLASS AT THE TOP WHEN COMPILING MULTIPLE CLASSES
// -------------------
import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
    int num = s.nextInt();
    
    int sq = num * num;
    int count=0;
      int ans=0;
    
    while(num > 0){
      int rem = num % 10;
      int rem1 = sq % 10;
      
      if(rem == rem1){
      	count++;
      }
      ans++;
      num/=10;
      sq/=10;
    }
    if(count == ans){
    	System.out.println("YES");
    }else{
    	System.out.println("NO");
    }
      
  }
}

or


  if(String.valueOf(sq).endsWith(String.valueOf(num))){
  return true;
  }else{
  return false;
  }
