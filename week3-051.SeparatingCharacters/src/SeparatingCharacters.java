
import java.util.Scanner;

public class SeparatingCharacters {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type your name: ");
        String name = reader.nextLine();

        int i = 0;
        int j = 1;
        while (i <= name.length() - 1 && j <= name.length()) {
//            if (name.length() < 3) {
//                break;
//            }
            System.out.println(j + ". character: " + characterFinder(name, i));
            i++;
            j++;
        }
    }

    public static char characterFinder(String name, int index) {
        return name.charAt(index);
    }
}
