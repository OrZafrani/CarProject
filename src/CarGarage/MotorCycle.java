package CarGarage;

public class MotorCycle extends Vehicle{

    private String name;

    public MotorCycle(String name) {
        this.name = name;
    }

    @Override
    int getFixTime() {
        return 3;
    }

    @Override
    public void fixed(){
        System.out.println("Both wheels have been repaired ");
    }

    @Override
    public String toString() {
        return "MotorCycle" +
                " " + name  ;
    }
}
