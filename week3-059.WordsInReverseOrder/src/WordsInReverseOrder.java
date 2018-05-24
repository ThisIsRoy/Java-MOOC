import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInReverseOrder {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here an ArrayList

        ArrayList<String> words = new ArrayList<String>();

        String input = "start";

        while (!input.isEmpty()) {
            System.out.print("Type a word: ");
             input = reader.nextLine();

             if (!input.isEmpty()) {
                 words.add(input);
             }
        }

        Collections.reverse(words);

        System.out.println("You typed the following words:");
        for (String word: words) {
            System.out.println(word);
        }
    }
}
