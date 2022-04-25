
import java.util.*;

public class BirdwatcherDb {

    private ArrayList<Bird> birds;
    private String[] commands;
    private Scanner r = new Scanner(System.in);
    private StringUtils s = new StringUtils();
    //public String input;

    public BirdwatcherDb() {
        this.birds = new ArrayList<Bird>();
        this.commands = new String[]{"Add", "Observation", "Statistics", "Show"};

    }

    public void run() {

        while (true) {
            System.out.print("? ");

            String input = r.nextLine();

            // commands 
            for (String command : this.commands) {
                if (StringUtils.included(input, command)) {
                    if (command.equals("Add")) {
                        this.add();
                    } else if (command.equals("Observation")) {
                        this.observe();
                    } else if (command.equals("Statistics")) {
                        this.stats();
                    } else if (command.equals("Show")) {
                        this.show();
                    }
                }
            }

            if (StringUtils.included(input, "Quit")) {
                break;
            }
        }
    }

    public void add() {
        System.out.print("Name: ");
        String name = r.nextLine();

        System.out.print("Latin name: ");
        String latinName = r.nextLine();

        birds.add(new Bird(name, latinName));

    }

    public void observe() {
        System.out.println("What was observed?: ");
        String name = r.nextLine();
        for (Bird bird : birds) {
            if (StringUtils.included(name, bird.getName())) {
                bird.observe();
                System.out.println("Observation added");
                return;
                //added return so that the first one it finds a match for, it states that "observation added".
                //if no return is added, for each bird that is not a match, it will go the below statement...

            }
            
        } System.out.println("Is not a bird!");
        // needs to be outside for loop else it will keep saying "is not a bird" each time it completes a loop
    }

    public void show() {
        System.out.println("What? ");
        String name = r.nextLine();
        for (Bird bird : birds) {
            if (StringUtils.included(name, bird.getName())) {
                this.printBird(bird);
            }
        }

    }

    public void printBird(Bird bird) {

        System.out.println(bird.getName() + " (" + bird.getLatinName() + "): " + bird.getObs() + " observations");

    }

    public void stats() {
        for (Bird bird : birds) {
            this.printBird(bird);
        }

    }
}
