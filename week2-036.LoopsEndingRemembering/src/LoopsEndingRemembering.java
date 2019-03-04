
import java.util.Scanner;

public class LoopsEndingRemembering {

    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts

        Scanner reader = new Scanner(System.in);

        System.out.println("Type numbers:");
        int sum = 0;
        int i = 0;
        int evens = 0;  // number of even numbers
        int odds = 0;   // number of odd numbers
        
        while (true) {

            int nums = Integer.parseInt(reader.nextLine());
            sum += nums;
            i++;

            if (nums != -1) {
                if (nums % 2 == 0) {
                    evens++;
                } else {
                    odds++;
                }
            }

            if (nums == -1) {
                System.out.println("Thank you and see you later!");
                sum += 1;
                System.out.println("The sum is " + sum);
                i -= 1;
                System.out.println("How many numbers: " + i);
                double avg = (double) sum / i;
                System.out.println("Average: " + avg);
                System.out.println("Even numbers: " + evens);
                System.out.println("Odd numbers: " + odds);
                break;
            }
        }

    }
}
