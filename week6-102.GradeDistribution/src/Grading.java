
import java.util.*;
import java.text.DecimalFormat;

public class Grading {

    private ArrayList<Integer> scores;
    private ArrayList<Integer> grades;
    private int accepted = 0;
    private double acceptanceRate;
    private DecimalFormat twoDecimalPoints = new DecimalFormat();
    private Scanner r = new Scanner(System.in);

    public void run() {
        this.enterScores();
        this.sortIntoGrades();
        this.showDistribution();
    }

    public Grading() {
        this.scores = new ArrayList<Integer>();
        this.grades = new ArrayList<Integer>();
    }

    public void enterScores() {

        System.out.println("Type exam scores, enter -1 to finish");

        while (true) {

            int input = Integer.parseInt(r.nextLine());
            if (!(input < 0 || input > 60)) {
                scores.add(input);
            }

            if (input == -1) {
                break;
            }
        }
    }

    public void sortIntoGrades() {
        for (int m : scores) {
            if (m < 30) {
                grades.add(0);
            } else if (m > 29 && m < 35) {
                grades.add(1);
                accepted++;
            } else if (m > 34 && m < 40) {
                grades.add(2);
                accepted++;
            } else if (m > 39 && m < 45) {
                grades.add(3);
                accepted++;
            } else if (m > 44 && m < 50) {
                grades.add(4);
                accepted++;
            } else if (m > 49 && m < 61) {
                grades.add(5);
                accepted++;
            }

        }
    }

    public void showDistribution() {

        System.out.println("Grade distribution: ");

        for (int i = 5; i >= 0; i--) {
            System.out.print(i + ": ");

            for (int j : grades) {
                if (j == i) {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
        System.out.println("Acceptance percentage: " + this.acceptanceRate());
    }

    public double acceptanceRate() {
        if (!grades.isEmpty()) {
            return 100 * accepted / grades.size();
        }
        return 0;
    }
}
