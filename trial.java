public class trial {
    public static void main(String[] args) {
        int num = 12345; // example integer value
while (num > 0) {
    int digit = num % 10; // get the rightmost digit
    System.out.println(digit); // print the digit
    num = num / 10; // remove the rightmost digit
        }
    }
}
