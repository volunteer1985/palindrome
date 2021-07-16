public class Main {
    public static boolean isPalindrome(int x) {
        int inputNumber = x;
        int reverseNumber = 0;
        int reversator = 0;
        while (inputNumber != 0) {
            reversator = inputNumber % 10;
            reverseNumber = reverseNumber * 10 + reversator;
            inputNumber /= 10;


        }
        if (x == reverseNumber){
            return true;
        }
        return false;

    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(1112));
    }
}
