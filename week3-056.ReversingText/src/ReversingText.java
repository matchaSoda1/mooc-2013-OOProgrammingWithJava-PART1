
import java.util.Scanner;

public class ReversingText {

    public static String reverse(String text) {
        int i = 1;
        String reversedWord = "";

        while (i <= text.length()) {
//            String character = text.charAt(text.length() - i));
//            reversedWord += character;
//            ^ incorrect!

            reversedWord += text.charAt(text.length()-i);
            i++;
        }
        return reversedWord;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in your text: ");
        String text = reader.nextLine();
        System.out.println("In reverse order: " + reverse(text));
    }
}
