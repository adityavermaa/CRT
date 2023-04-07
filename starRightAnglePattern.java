public class starRightAnglePattern {
    public static void main(String[] args){
        rightAngle(5);
    }
    static void rightAngle(int n){
        for(int row=1; row<=n; row++){
            for(int col=1; col<=row; col++){
                System.out.print("*");
            }
            System.out.println("\n");
        }
    }
}
