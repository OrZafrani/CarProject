package CarGarage;

public class Truck extends Vehicle {
    private String name;

    public Truck(String name) {
        this.name = name;
    }

    @Override
    int getFixTime() {
        return 10;
    }

    @Override
    public void fixed(){
        System.out.println("Honker sound updated");
    }

    @Override
    public String toString() {
        return "Truck" +
                " " + name
                ;
    }
}
