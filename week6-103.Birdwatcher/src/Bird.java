
public class Bird {
    private String name;
    private String latinName;
    private int observations;

public Bird(String name, String latinName) {
    this.name = name;
    this.latinName = latinName;
    this.observations = 0;
}

public void observe() {
    this.observations++;
}

public String getName() {
    return this.name;
}

public String getLatinName() {
    return this.latinName;
}

public int getObs() {
    return this.observations;
}

}
