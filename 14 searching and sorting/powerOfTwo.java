class powerOfTwo {
    // function definition
    public static boolean checkPowerOfTwo(int num){
        if(num == 0){
            return false;
        }

        else{
            // if this condition is true, result is true...otherwise it is false

            return ((num & num - 1) == 0);
        }

    }
    public static void main(String[] args){
        int num = 64;
        // function calling
        if(checkPowerOfTwo(num)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
