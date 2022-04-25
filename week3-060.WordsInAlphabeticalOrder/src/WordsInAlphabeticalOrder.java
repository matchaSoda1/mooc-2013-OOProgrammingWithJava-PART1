
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInAlphabeticalOrder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> composers = new ArrayList<String>();
        
        while(true)
        {
            System.out.println("Type a word: ");
        String composer = reader.nextLine();
            if (composer.equals("")) {
                break;
            } else {
                composers.add(composer);
            }
        }
        Collections.sort(composers);
        System.out.println("You typed the following words: ");
            for (String i:composers) {
                System.out.println(i);
            }
    }
}
