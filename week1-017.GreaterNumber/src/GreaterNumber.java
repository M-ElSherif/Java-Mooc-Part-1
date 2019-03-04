import java.util.Scanner;

public class GreaterNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type the first number: ");
        int numFirst = Integer.parseInt(reader.nextLine());
        System.out.println("Type the second number: ");
        int numSecond = Integer.parseInt(reader.nextLine());
        
        String greaterNum = "Greater number: ";
        
        if (numFirst > numSecond) {
            System.out.println(greaterNum + numFirst);
        }
        else if (numFirst < numSecond) {
            System.out.println(greaterNum + numSecond);
        }
        else {
            System.out.println("The numbers are equal");
        }
    }
}
