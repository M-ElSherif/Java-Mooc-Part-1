
import java.util.Scanner;

public class BiggerNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a number: ");
        int number = Integer.parseInt(reader.nextLine());
        
        System.out.println("Type another number: ");
        int anotherNumber = Integer.parseInt(reader.nextLine());
        
        int maximum = Math.max(number, anotherNumber);
        System.out.println("The bigger number of the two numbers given was: " + maximum);
        
        // Implement your program here. Remember to ask the input from user
    }
}
