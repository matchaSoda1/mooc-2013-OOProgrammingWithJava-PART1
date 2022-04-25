
import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {

    private ArrayList<Integer> numbers;

    public LotteryNumbers() {
        // Draw numbers as LotteryNumbers is created
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        // We'll format a list for the numbers
        
        this.numbers = new ArrayList<Integer>();
        Random randomiser = new Random();
        int i = 1;
        
        while (i <= 7) {

            int number = randomiser.nextInt(39) + 1;
            if (!containsNumber(number)) {
                numbers.add(number);
                i++;
            }
            
        }

    }

    public boolean containsNumber(int number) {
        // Test here if the number is already in the drawn numbers
        return numbers.contains(number);

    }
}
