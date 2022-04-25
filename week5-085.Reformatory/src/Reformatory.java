
public class Reformatory {

    private int timesWeightMeasured = 0;

    public int weight(Person person) {
        // return the weight of the person
        this.timesWeightMeasured++;
        System.out.println("measured weight this many times: " + this.timesWeightMeasured);
        return person.getWeight();

    }

    public void feed(Person person) {
        person.setWeight(person.getWeight() + 1);
    }

    public int totalWeightsMeasured() {
        return this.timesWeightMeasured;
    }

    
}
