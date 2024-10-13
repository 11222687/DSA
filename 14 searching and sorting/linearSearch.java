public class linearSearch {
    //function definition
    // Approch: Linear Search
    // time complexity: O(n)
    // space complexity: O(1)
    
    public static int linearSearch(int[] arr, int n, int target){
        int result = -1;
        for(int i=0; i<n; i++){
            if(arr[i] == target){
                result = i;
                break;
            }
        }
        return result;
    }
    
    public static void main(String[] args){
        int[] arr = {6, 3, 1, 9, 14, 23, 32, 7};
        int n = arr.length;
        int target = 12;
        // function calling
        int result = linearSearch(arr, n, target);

        if(result != -1){
            System.out.println("Element is present at the index: "+result);
        }
        else{
            System.out.println("Element is not found in an array");
        }
    }
}
