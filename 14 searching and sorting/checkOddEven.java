public class checkOddEven {
    public static void checkOddOREven(int num){
        // (num&1) == 0 then the number is even, otherwise it is odd
        if((num & 1) == 0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
   public static void main(String[] args){
    int num = 27;
    checkOddOREven(num);
}
}

