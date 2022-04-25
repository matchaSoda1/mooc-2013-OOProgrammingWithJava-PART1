
import java.util.Calendar;

public class Person {

    private String name;
    private MyDate birthday;

    public Person(String name, int pp, int kk, int vv) {
        this.name = name;
        this.birthday = new MyDate(pp, kk, vv);
    }
    
    public Person(String name, MyDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }
    
    public Person(String name) {
        
        int todayDay = Calendar.getInstance().get(Calendar.DATE);
        int todayMonth = Calendar.getInstance().get(Calendar.MONTH) + 1; // January is 0 so we add one
        int todayYear = Calendar.getInstance().get(Calendar.YEAR);
        
        this.name = name;
        this.birthday = new MyDate(todayDay,todayMonth,todayYear);
    }

    public int age() {
// calculate the age based on the birthday and the current day
        // you get the current day as follows: 

        int todayDay = Calendar.getInstance().get(Calendar.DATE);
        int todayMonth = Calendar.getInstance().get(Calendar.MONTH) + 1; // January is 0 so we add one
        int todayYear = Calendar.getInstance().get(Calendar.YEAR);

        MyDate today = new MyDate(todayDay,todayMonth,todayYear);
        
        return birthday.differenceInYears(today);

    }

    public boolean olderThan(Person compared) {
        
        if (this.birthday.differenceInYears(compared.birthday) == 0) {
            return this.birthday.serialDate()<compared.birthday.serialDate();
            
        }
        return this.age()>compared.age();
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return this.name + ", born " + this.birthday;
    }
}
