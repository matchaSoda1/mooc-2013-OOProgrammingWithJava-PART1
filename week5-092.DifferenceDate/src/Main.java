
public class Main {

    public static void main(String[] args) {
        // write test code here
        
        MyDate firstDate = new MyDate(24,11,2009);
        MyDate secondDate = new MyDate(1,1,2011);
        MyDate thirdDate = new MyDate(25,12,2010);
        
        System.out.println(firstDate + " and " + secondDate + ", difference: " + secondDate.differenceInYears(firstDate));
        System.out.println(secondDate + " and " + firstDate + ", difference: " + firstDate.differenceInYears(secondDate));
    
    }
}
