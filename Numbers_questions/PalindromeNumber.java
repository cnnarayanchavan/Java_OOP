package Numbers_questions;

public class PalindromeNumber {
    public static void main(String[] args) {
        int num = 676;
        int revNum = 0;
        int original = num;
        while(num > 0){
            int lastDigit = num % 10; 
            revNum = (revNum * 10) + lastDigit;
            num = num / 10;
        }
        String result = (revNum == original)?("It is palindrome"):("It is not palindrome");
        System.out.println(result);
    }
}
