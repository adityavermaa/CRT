import java.util.Arrays;
import java.util.Scanner;
public class enterProblemsInYourToDoList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the Number of items in To-do List: ");
        int a = sc.nextInt();
        int[]arr = new int[a];
        int sum = 0;
        System.out.println("Enter the Number of problems: ");
        for(int i=0; i<5; i++){
            for(int j=0; j<a; j++){
                arr[j]=sc.nextInt();
                if(arr[j]>=1000){
                    sum++;
                }
        }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(sum);
    }
}
