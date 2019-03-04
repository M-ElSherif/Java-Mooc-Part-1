
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a number: ");
        double number = Integer.parseInt(reader.nextLine());
        
        System.out.println("Type another number: ");
        double anotherNumber = Integer.parseInt(reader.nextLine());
        
        double division = number / anotherNumber;
        
        System.out.println("Division: " + number + " / " + anotherNumber + " = " + division);
        
        // Implement your program here. Remember to ask the input from user.
    }
}
