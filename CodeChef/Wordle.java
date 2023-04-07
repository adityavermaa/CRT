package CodeChef;

import java.util.Scanner;
public class Wordle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        // String[]valuesArray = new String[a*3];
        for(int i=0; i<a; i++){
                String b = sc.next();
                String c = sc.next();
                for(int k=0; k<b.length(); k++){
                    if(b.charAt(k)==c.charAt(k)){
                        System.out.print("G");
                    }
                    else{
                        System.out.print("B");
                    }
                    
            }
        }
        
    }
}