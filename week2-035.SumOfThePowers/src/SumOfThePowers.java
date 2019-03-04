
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a number: ");
        int num = Integer.parseInt(reader.nextLine());

        int i = 0;
        double exp;
        int result = 0;

        while (i <= num) {
            exp = Math.pow(2, i);
            result += (int) exp;
            i++;
        }
        System.out.println("The result is " + result);
    }
}
