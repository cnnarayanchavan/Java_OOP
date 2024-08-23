package Numbers_questions;

public class CountDigits {
    public static void main(String[] args) {
        int num = 453567896;
        int sum = 0;
        while(num > 0){
            num = num / 10;
            sum++;
        }
        System.out.println("total digits: "+sum);
    }
}
