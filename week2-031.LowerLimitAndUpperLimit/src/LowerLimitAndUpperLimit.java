
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("First: ");
        int first = Integer.parseInt(reader.nextLine());
        System.out.println("Last: ");
        int last = Integer.parseInt(reader.nextLine());
        
        if (first > last) {
            System.out.println("");
        }
        
        int i = first;
        
        while (i <= last) {
            System.out.println(i);
            i++;
        }

    }
}
