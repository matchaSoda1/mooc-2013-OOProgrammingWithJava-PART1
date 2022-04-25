
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write here the main program
//        Student pekka = new Student("Pekka Mikkola", "01314");
//        System.out.println("name: " + pekka.getName());
//        System.out.println("student no: " + pekka.getStudentNumber());
//        System.out.println(pekka);

        Scanner reader = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<Student>();

        while (true) {
            System.out.print("name: ");
            String name = reader.nextLine();

            if (name.isEmpty()) {
                break;
            }

            System.out.print("student number: ");
            String studentNo = reader.nextLine();
            students.add(new Student(name, studentNo));
        }
        System.out.println("");
        
        for (Student p : students) {
            System.out.println(p);
        }

        System.out.println("");

        System.out.println("Give search term: ");
        String searchTerm = reader.nextLine();

        System.out.println("Result: ");
        for (Student p : students) {
            if (p.getName().contains(searchTerm)) {
                System.out.println(p);
            }

        }
    }
}
