public class starSquarePattern{
     public static void main(String[]args){
        starSquarePattern(4);
     }
     static void starSquarePattern(int n){
        for(int row=1; row<=n; row++){
            //for every row run the column
            for(int col=1; col<=n; col++){
                System.out.print("*");
            }
            System.out.println("\n");
        }
     }
}