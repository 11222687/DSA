// time complexity: O(n)
// space complexity: O(1)

public class oddFreqNum {
    public static int getoddFreqNum(int[] nums){
        int xor = 0;
        for(int num: nums){
            xor = xor ^ num;
        }
        // odd number of times in a given array
        return xor;
    }
    public static void main(String[] args){
        int nums[] = {4, 3, 6, 2, 6, 4, 2, 3, 4, 3, 3, 4, 3};
        int result = getoddFreqNum(nums);
        System.out.println("The odd frequency occuring number is: "+result);
    }
}
