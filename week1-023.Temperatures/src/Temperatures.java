
import java.util.Scanner;

public class Temperatures {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        // Write your code here. 
        
        while (true) {
            System.out.println("Type a floating point number: ");
            double num = Double.parseDouble(reader.nextLine());
            String quitLoop = "quit";

            if (num >= -30 && num <= 40) {
                Graph.addNumber(num);
            }
        }
    }
}