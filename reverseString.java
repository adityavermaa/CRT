public class reverseString {
    public static void main(String[] args) {
        String a = "hello";
        // System.out.println(a.charAt(1));
        for(int i=a.length()-1; i>=0; i--){
            System.out.print(a.charAt(i));
        }
        System.out.println(a.length());
    }
}
