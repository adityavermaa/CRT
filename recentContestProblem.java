import java.util.Scanner;

public class RecentContestProblems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // number of test cases
        while (t-- > 0) {
            int n = sc.nextInt(); // total count of problems
            int start38Count = 0, ltime108Count = 0; // counters for each contest
            for (int i = 0; i < n; i++) {
                String contestCode = sc.next();
                if (contestCode.equals("START38")) {
                    start38Count++;
                } else if (contestCode.equals("LTIME108")) {
                    ltime108Count++;
                }
            }
            System.out.println(start38Count + " " + ltime108Count);
        }
        sc.close();
    }
}
