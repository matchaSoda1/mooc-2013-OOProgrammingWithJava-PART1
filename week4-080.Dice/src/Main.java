
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Dice dice = new Dice(9);

//        int i = 0;
//        while (i < 10) {
//            System.out.println(dice.roll());
//            i++;
//        }
        Random random = new Random();
        int i = 0;
        while (i <= 20) {

            System.out.println("i: " + i + " rand: " + random.nextInt(5));
            i++; //so it prints range 0 to i - 1
            // range +1 then would print 1 to i
        }
    }
}
