package CarGarage;

public class MotorCycle extends Vehicle{


    public MotorCycle(String name) {
        super(name);
    }

    @Override
    int getFixTime() {
        return 3;
    }

    @Override
    public void fixed(){
        System.out.println("Both wheels have been repaired ");
    }

    public static MotorCycle build(String name){
        return new MotorCycle(name);
    }

    @Override
    public String toString() {
        return "MotorCycle" +
                " " + name  ;
    }
}
