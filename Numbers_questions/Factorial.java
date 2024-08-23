package Numbers_questions;

public class Factorial {
    public static void main(String[] args) {
        int num = 5; // 7 * 6 * 5 * 4 * 3 * 2 * 1 = ?
        int fact = 1;  //coz base condition factorial of 0 os 1 and fact of 1 is aslo 1;
        for(int i = 1; i<= num; i++){
            fact = fact * i;
        }
        System.out.println(fact);
    }
}
