package Numbers_questions;
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        for(int i = 1; i<=num; i++){
            if (num % i ==0) {
                count++;
            }
        }
        String ans = (count == 2)?"prime":"notPrime";
        System.out.println(ans);
    }
}
