package CarGarage;

public abstract class Vehicle implements Fixable {

    protected String name;

    public Vehicle(String name){
        this.name = name;
    }

    abstract int getFixTime();
}
