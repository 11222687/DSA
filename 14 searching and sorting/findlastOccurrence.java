public class findlastOccurrence {

    // function definition
    public static int findlastOcc(int[] arr, int low, int high, int target){
        int result = -1;
        while(low <= high){
            int mid = low + (high - low)/2;

            if(arr[mid] == target){
                result = mid;
                // explore towards the right side to get the last occurence of an element
                low = mid + 1;
            }

            else if(arr[mid] < target){
                // explore towards the right side of the array
                low = mid + 1;
            }

            else{
                high = mid - 1;
            }
        }
        return result;
    }

    public static void main(String[] args){
        int[] arr = {1, 1, 1, 1, 3, 3, 4, 5, 9, 9, 9, 9, 9};
        int n = arr.length;
        int target = 10;
        // function calling
        int result = findlastOcc(arr, 0, n-1, target);

        System.out.println(result);
        /* 
        if(result != -1){
            System.out.println("The last occurence of a given target element is: "+result);
        }
        else{
            System.out.println("Element is not found in an array");
        }
        */
    }
}
