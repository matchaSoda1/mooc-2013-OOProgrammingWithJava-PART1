import java.util.*;

public class Phonebook {

    private ArrayList<Person> phonebook;

    public Phonebook() {
        this.phonebook = new ArrayList<Person>();
    }

    public void add(String name, String phoneNo) {
        Person p = new Person(name, phoneNo);
        this.phonebook.add(p);
    }

    public void printAll() {
        for (Person p : this.phonebook) {
            System.out.println(p);
        }
    }

    public String searchNumber(String search) {
        for (Person p : this.phonebook) {
            if (p.getName().equals(search)) {
                return p.getNumber();
            }
        } return "number not known";

    }
}
