public class Person {
    
    private String name;
    private String phoneNumber;
    
    public Person(String name, String phoneNo) {
        this.name = name;
        this.phoneNumber = phoneNo;
    }
             
    public String getName() {
        return this.name; 
    }
    
    public String getNumber() {
        return this.phoneNumber;
    }
    
    public void changeNumber(String newNo) {
        this.phoneNumber = newNo;        
    }
    
    public String toString() {
        return this.name + ", phone number: " + this.phoneNumber;
    }
}
