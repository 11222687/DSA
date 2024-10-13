// approach: binary search
// time complexity: O(logn)
// space complexity: O(1)

public class isPerfectSquare {
    public static boolean isPerfect(int num){
        if(num == 1){
            return true;
        }

        long low = 0, high = num/2;
        while(low <= high){
            long mid = low + (high - low)/2;
            if(mid * mid < num){
                // traverse towards the right side of the mid
                low = mid + 1;
            }

            else if(mid * mid > num){
                // traverse towards the left side of the mid
                high = mid - 1;
            }

            else return true;
        }

        return false;
    }
    public static void main(String[] args){
        int num = 14;
        if(isPerfect(num)){
            System.out.println("The given number is a perfect square number");
        }
        else{
            System.out.println("The given number is not a perfect square number");
        }
    }
}
