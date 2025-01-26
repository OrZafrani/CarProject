package CarGarage;
import java.util.ArrayList;

public class DB {

    private ArrayList<Vehicle> DB;

    public DB() {
        DB = new ArrayList<>();
    }

    public void addVehicle(Vehicle v){
        DB.add(v);
    }

    public ArrayList<Vehicle> getVehicles(){
        return DB;
    }

}
