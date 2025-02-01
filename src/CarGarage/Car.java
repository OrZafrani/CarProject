package CarGarage;

public class Car extends Vehicle{

    public Car(String name) {
        super(name);
    }

    @Override
    int getFixTime() {
        return 5;
    }

    @Override
    public void fixed(){
        System.out.println("Car headlight reinstalled");
    }

    public static Car build(String name){
        return new Car(name);
    }

    @Override
    public String toString() {
        return "Car" +
                " " + name ;
    }
}
