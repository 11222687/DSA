public class countOfOne {
    // function definition
    // approach - binary search
    // time complexity - O(log n)
    // space complexity - O(1)
    public static int countNumOne(int[] arr, int low, int high){
        while(low <= high){
            int mid = low + (high - low)/2;

            if(arr[mid] == 0){
                // traverse towards the right side of the mid
                low = mid + 1;
            }
            else{
                // traverse towards the left side of the mid
                high = mid - 1;
            }
        }

        return arr.length - low;
    }
    public static void main(String[] args){
        int[] arr = {0, 0, 0, 1, 1, 1, 1, 1};
        int n = arr.length;
        // function calling
        int count = countNumOne(arr, 0, n-1);
        System.out.println("Count of number of 1's in a sorted binary array is: "+count);
    }
}
