public class practice {
    public static void main(String[]args){
        // increasing(5);
        // decreasing(5);
        // numbers(5);
        // pattern5(5);
        // pattern6(11);
        pattern7(5);
    }
    static void numbers(int n){
        for(int row=1; row<=n; row++){
            for(int col=1; col<=row-1; col++){
                System.out.print(col);
            }
            System.out.print("\n");
        }
    }
    static void increasing(int n){
        for(int row=1; row<=n; row++){
            for(int col=1; col<=row; col++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
    static void decreasing(int n){
        for(int row=1; row<=n; row++){
            for(int col=n; col>=row; col--){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
    static void pattern5(int n){
        for(int row=1; row<=n-1; row++){
            for(int col=n-1; col>=row; col--){
                System.out.print("+");
            }
            for(int col=1; col<=row-1; col++){
                System.out.print("*");
            }
        System.out.print("\n");    
        }
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
    static void pattern7(int n){ //n=5
        for(int row=1; row<=n; row=row+2){
            for(int col=1; col<(row+2)/2; col++){
                System.out.print("-");
            }
            for(int col=n; col>=row; col--){
                System.out.print("*");
            }
            System.out.print("\n");
           
        }
        for(int row=1; row<=n; row=row+2){
            for(int col=1; col<=(row+1)/2; col++){
                System.out.print("-");
            }
            // for(int)
            System.out.print("\n");
        }
    }
}
