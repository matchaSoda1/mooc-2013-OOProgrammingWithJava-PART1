
public class Main {

    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();
        
        phonebook.add("Alice", "071234568");
        phonebook.add("David", "071773463");
        phonebook.add("Kat", "079923557");
        
        phonebook.searchNumber("David");
    }
}
