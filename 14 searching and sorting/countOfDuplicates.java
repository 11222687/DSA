class countOfDuplicates {

    // getfirstOcc definition
    public static int getfirstOcc(int[] arr, int low, int high, int target){
        int result = -1;
        while(low <= high){
            int mid = low + (high - low)/2;

            if(arr[mid] == target){
                result = mid;
                // explore towards the left side to get the first occurence of an element
                high = mid - 1;
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

    // getlastOcc definition
    public static int getlastOcc(int[] arr, int low, int high, int target){
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
        int[] arr = {2, 4, 5, 5, 5, 7, 8, 9, 9, 9, 9, 9};
        int target = 15;

        int firstOccurence = getfirstOcc(arr, 0, arr.length - 1, target);
        int lastOccurence = getlastOcc(arr, 0, arr.length - 1, target);

        if(firstOccurence == lastOccurence && firstOccurence == -1){
            System.out.println("Element not found in an array");
        }
        else{
            int frequency = lastOccurence - firstOccurence + 1;
            System.out.println("The count of the given target element is: "+frequency);
        }
    }    
}
