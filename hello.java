public class hello {
    public static void main(String args[]) throws Exception {
       String str = "aditya";
       int i = 0;
       for(char c: str.toCharArray()) {
          i++;
       }
       System.out.println(i);
    }
 }