package Numbers_questions;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int num = 153;
        int original = num;
        int digits = String.valueOf(num).length();
        int armStrong = 0;
        while(num > 0){
            int lastDigit = num % 10;
            armStrong += Math.pow(lastDigit,digits);
            num = num / 10;
        }
        String result = (original == armStrong)? "It is armstrong":"it is not";
        System.out.println(result);
    }
}
