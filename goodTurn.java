import java.util.Scanner;
public class goodTurn{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b=sc.nextInt();
        
        for(int i=0; i<a; i++){
          for(int j=0; j<b; j++){
            int x = sc.nextInt();
            // int y = sc.nextInt();`
            if(x+y<6){
                System.out.println("YES");
            }
            if(x+y>6){
                System.out.println("No");
            }
          }
        }
    }
}