public class countSetBits {
    public static int getCountSetBits(int num){
        int count = 0;
        while(num > 0){
            count += num & 1;
            num >>= 1;
        }
        return count;
    }

    public static void main(String[] args){
        int num = 15;
        int countSetBits = getCountSetBits(num);
        System.out.println("The count of the number of set bits is: "+countSetBits);
    }
}
