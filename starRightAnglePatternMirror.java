public class starRightAnglePatternMirror {
    public static void main(String[]args){
        pattern(5);
    }
    static void pattern(int n){
        for(int row=1; row<=n; row++){
            for(int col=n; col>=row; col--){
                System.out.print(n+1-col);
            }
            System.out.print("\n");
        }
    }
}
