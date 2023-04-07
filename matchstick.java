import java.util.*;

class matchStick{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int[] matchCounts = {6, 2, 5, 5, 4, 5, 6, 3, 7, 6}; // number of matches needed for each digit
            int sum = a + b;
            int matches = 0;
            while (sum > 0) {
                int digit = sum % 10;
                matches += matchCounts[digit];
                sum = sum / 10;
            }
            System.out.println(matches);
        }
    }
}
