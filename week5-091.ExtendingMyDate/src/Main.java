
public class Main {

    public static void main(String[] args) {
        MyDate test = new MyDate(01,11,2019);
        MyDate newMyDate = test.afterNumberOfDays(7);
        System.out.println(test);
        System.out.println(newMyDate);
    }
}
