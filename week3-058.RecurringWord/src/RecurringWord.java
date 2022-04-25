
import java.util.ArrayList;
import java.util.Scanner;

public class RecurringWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> groceries = new ArrayList<String>();

        while (true) {
            System.out.println("Type a word: ");
            String groceryItem = reader.nextLine();

            if (groceries.contains(groceryItem)) {
                System.out.println("You gave the word " + groceryItem + " twice");
                break;
            } else {
                groceries.add(groceryItem);
            }
        }

    }
}
