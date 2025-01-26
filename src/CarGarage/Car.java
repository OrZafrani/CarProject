package CarGarage;

public class Car extends Vehicle{
    private String name;

    public Car(String name) {
        this.name = name;
    }

    @Override
    int getFixTime() {
        return 5;
    }

    @Override
    public void fixed(){
        System.out.println("Car headlight reinstalled");
    }

    @Override
    public String toString() {
        return "Car" +
                " " + name ;
    }
}
