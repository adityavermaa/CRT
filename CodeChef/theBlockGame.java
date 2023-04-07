package CodeChef;
import java.util.Scanner;
public class theBlockGame {
    public static void main(String[] args) {
        Scanner tb = new Scanner(System.in);
	  int T = tb.nextInt();
	  
	  for(int i = 1;i <= T;i++)
	  {
	      int N = tb.nextInt();
	      int temp,r,sum =0;
	      temp = N;    
          while(N > 0)
          {    
          r = N % 10;  
          sum = (sum * 10) + r;  
          System.out.println(sum);  
          N = N / 10;    
          }    
          if(temp == sum)    
          System.out.println("wins");    
          else    
          System.out.println("loses");    
	  }
    }
}
