public class binarySearch{
    public static void main(String[] args) {
               //0,1,2,3,4,5,6
    int[]nums = {1,1,2,2,2,2,3};
    int target = 2;
    int ans = binarySearch(nums, target);
    System.out.println(ans);
    }
    static int binarySearch(int[]arr, int target){
        int start = 0;
        int end = arr.length-1;
        for(int i=0; i<arr.length; i++){
            int mid = start+(end-start)/2;
            if(target>arr[mid]){
                start = mid+1;
            }
            else if(target<arr[mid]){
                end = mid-1;
            }
        }
        
        return -1;
    }
}