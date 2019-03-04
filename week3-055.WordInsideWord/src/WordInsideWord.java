
import java.util.Scanner;

public class WordInsideWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type the first word: ");
        String firstWord = reader.nextLine();
        System.out.println("Type te second word: ");
        String secondWord = reader.nextLine();
        
        if (searchOccurrence(firstWord,secondWord) != -1) {
            System.out.println("The word " + secondWord + " is found in the word " 
                    + firstWord);
        }
        else {
            System.out.println("The word " + secondWord + " is not found in the word " 
                    + firstWord);
        }
    }
    
    public static int searchOccurrence(String word1, String word2) {
        return word1.indexOf(word2);
    }
}
