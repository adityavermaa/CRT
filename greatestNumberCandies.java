import java.util.Arrays;
public class greatestNumberCandies{
    public static void main(String[] args) {
        int[]candies={2,3,5,1,3};
        int extraCandies = 3;
        for(int i=0; i<candies.length; i++){
            candies[i]=candies[i]+3;
        }
        System.out.println(Arrays.toString(candies));
    }
    
    
}