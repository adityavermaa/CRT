package CodeChef;
import java.util.Scanner;
import java.util.Arrays;
public class MarioAndBrokenString {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    String ans = "";
    for(int i=0; i<a; i++){
        int b = sc.nextInt();
        String c = sc.next();
        int n = c.length();
        for(int j=0; j<n/2; j++){
            if(c.charAt(j)==c.charAt((b/2)+j)){
                ans = "YES";
            }
            else{
                ans = "NO";
            }
        }
        System.out.println(ans);
    }
   }
}

