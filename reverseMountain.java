public class reverseMountain {
    public static void main(String[] args){
        pattern6(11);
    }
    static void pattern6(int n){
        for(int row=1; row<=n; row=row+2){
            for(int col=n; col>=row; col--){
                System.out.print("*");
            }
            System.out.print("\n");
            for(int col=1; col<=(row+1)/2; col++){
                System.out.print(" ");
            }
        }
    }
}
