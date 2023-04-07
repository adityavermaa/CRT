package String;

public class countNumberOfWords {
    public static void main(String[] args) {
        String name = "How are You?";
        int count = 0;
        for(int i=0; i<name.length(); i++){
           if(name.charAt(i)==' '){
                count++;
            }
        }
        System.out.println(name.length()-count);
    }
}
