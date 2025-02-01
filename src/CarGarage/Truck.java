package CarGarage;

public class Truck extends Vehicle {

    public Truck(String name) {
    super(name);
    }

    @Override
    int getFixTime() {
        return 10;
    }

    @Override
    public void fixed(){
        System.out.println("Truck Honker sound updated");
    }

    public static Truck build(String name){
        return new Truck(name);
    }

    @Override
    public String toString() {
        return "Truck" +
                " " + name
                ;
    }
}
