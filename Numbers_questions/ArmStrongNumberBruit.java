package Numbers_questions;

public class ArmStrongNumberBruit {
    public static void main(String[] args) {
            int num = 69;
            int original = num;
            
            // Step 1: Calculate the number of sum in the number
            int sum = 0;
            int temp = num;
            while (temp > 0) {
                temp = temp / 10;
                sum++;
            }
    
            // Step 2: Calculate the Armstrong value
            int armStrong = 0;
            temp = num;
            while (temp > 0) {
                int lastDigit = temp % 10;
                
                // Step 3: Calculate the power of the last digit manually
                int power = 1; //36
                for (int i = 0; i < sum; i++) {
                    power = power * lastDigit;
                }
                
                armStrong = armStrong + power;
                temp = temp / 10;
            }
    
            // Step 4: Compare the original number with the calculated Armstrong value
            if (original == armStrong) {
                System.out.println(original + " is an Armstrong number.");
            } else {
                System.out.println(original + " is not an Armstrong number.");
            }
        }
    }
