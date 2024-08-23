package Numbers_questions;

public class ReverseNumber {
    public static void main(String[] args) {
        int num = 879;
        int revNum = 0;
        while(num > 0){
            int lastDigit = num % 10;
            revNum = (revNum * 10) + lastDigit;
            num = num / 10;
        }
        System.out.println("Reverse Number: "+revNum);
    }
}
