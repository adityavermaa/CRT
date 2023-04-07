package GFG;
public class noOfOccurrence {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 3, 3, 5, 5, 6};
        int num = 3;
        
        int count = countOccurrences(arr, num);
        System.out.println("Number of occurrences of " + num + " in the array is: " + count);
    }
    
    // Function to find the first occurrence of a number in the array
    public static int findFirstOccurrence(int[] arr, int num) {
        int start = 0;
        int end = arr.length - 1;
        int result = -1;
        
        while (start <= end) {
            int mid = start + (end - start) / 2;
            
            if (arr[mid] == num) {
                result = mid;
                end = mid - 1; // look for first occurrence on left side
            } else if (arr[mid] < num) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        
        return result;
    }
    
    // Function to find the last occurrence of a number in the array
    public static int findLastOccurrence(int[] arr, int num) {
        int start = 0;
        int end = arr.length - 1;
        int result = -1;
        
        while (start <= end) {
            int mid = start + (end - start) / 2;
            
            if (arr[mid] == num) {
                result = mid;
                start = mid + 1; // look for last occurrence on right side
            } else if (arr[mid] < num) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        
        return result;
    }
    
    // Function to count the occurrences of a number in the array
    public static int countOccurrences(int[] arr, int num) {
        int first = findFirstOccurrence(arr, num);
        int last = findLastOccurrence(arr, num);
        
        if (first == -1 || last == -1) {
            return 0;
        } else {
            return last - first + 1;
        }
    }
    
    // Main function to test the above functions
   
}
