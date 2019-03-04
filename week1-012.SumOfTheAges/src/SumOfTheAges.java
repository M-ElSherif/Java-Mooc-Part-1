
import java.util.Scanner;

public class SumOfTheAges {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type your name: ");
        String nameFirst = reader.nextLine();
        System.out.println("Type your age: ");
        int ageFirst = Integer.parseInt(reader.nextLine());
        
        System.out.println("Type your name: ");
        String nameSecond = reader.nextLine();
        System.out.println("Type your age: ");
        int ageSecond = Integer.parseInt(reader.nextLine());
        
        int sumOfAges = ageFirst + ageSecond;
        System.out.println(nameFirst + " and " + nameSecond + " are " + sumOfAges 
                + " years old in total");
        
        // Implement your program here
    }
}
