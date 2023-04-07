package String;

public class stringFromBackward {
    public static void main(String[] args) {
        String name = "Aditya Verma";
        for(int i=name.length()-1; i>=0; i--){
            System.out.print(name.charAt(i));
        }
    }
}
