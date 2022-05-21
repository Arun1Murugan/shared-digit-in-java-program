public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        if(hasSharedDigit(9,9)){
            System.out.println("Both numbers are sharing the digits.");
        }else{
            System.out.println("Both numbers are not sharing the digits.");
        }
    }
    public static boolean hasSharedDigit(int firstNumber, int secondNumber){
        if(firstNumber <= 10 || firstNumber >= 99 || secondNumber <= 10 || secondNumber >= 99){
            return false;
        }else{
            int firstNumberFirstDigit = firstNumber / 10; //
            int firstNumberLastDigit = firstNumber % 10; //
            int secondNumberFirstDigit = secondNumber / 10;
            int secondNumberLastDigit = secondNumber % 10;
            if((firstNumberFirstDigit == secondNumberFirstDigit) ||
                    (firstNumberFirstDigit == secondNumberLastDigit ) ||
                    (firstNumberLastDigit == secondNumberFirstDigit) ||
                    (firstNumberLastDigit == secondNumberLastDigit )){
                return true;
            }else{
                return false;
            }
        }
    }
}