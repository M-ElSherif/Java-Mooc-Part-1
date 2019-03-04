import java.util.Scanner;

public class ReversingName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type your name: ");
        String name = reader.nextLine();
        
        int nameLength = name.length();
        int i = nameLength - 1;
        
        System.out.print("In reverse order: ");
        while (i >= 0) {
            char nameChar = name.charAt(i);
            System.out.print(nameChar);
            i--;
        }
    }
    
    
}
