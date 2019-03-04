
import java.util.Scanner;

public class PositiveValue {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a number: ");
        int numberFirst = Integer.parseInt(reader.nextLine());
        
        if (numberFirst > 0) {
            System.out.println("The number is positive.2");
        }
        else {
            System.out.println("The number is not positive.");
        }

        // Type your program here:
    }
}
