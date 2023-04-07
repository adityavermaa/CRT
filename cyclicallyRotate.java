import java.util.Arrays;

public class cyclicallyRotate {
    public static void main(String[] args) {
                //0,1,2,3,4,5
        int[]arr={1,2,3,4,5,6};
        int[]arrFinal=new int[arr.length];
        for(int i=0; i<arr.length; i++){
            arr[0]=arr[arr.length-1];
            
        }
        System.out.println(Arrays.toString(arrFinal));
    }
}
