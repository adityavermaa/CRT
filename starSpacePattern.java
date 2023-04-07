public class starSpacePattern {
    public static void main(String[] args) {
        pattern5(6);
    }
    static void pattern5(int n){
        for(int row=1; row<=n-1; row++){
            for(int col=n-1; col>=row; col--){
                System.out.print(" ");
            }
            for(int col=1; col<=row; col++){
                System.out.print("*");
            }
        System.out.print("\n");    
        }
    }
}
