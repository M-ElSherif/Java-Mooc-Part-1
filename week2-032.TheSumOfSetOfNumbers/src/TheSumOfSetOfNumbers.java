
import java.util.Scanner;

// Create a program that calculates the sum 1+2+3+…+n where n is a number entered by the user.

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Until what? ");
        int num = Integer.parseInt(reader.nextLine());
        
        int i = 1;
        int sum = 0;
        
        while (i <= num) {
            sum += i;
            i++;
        }
        
        System.out.println("Sum is " + sum);
    }
}
