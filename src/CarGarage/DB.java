package CarGarage;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class DB {


    private HashMap<Integer, Queue<Vehicle>> DB;

    public DB() {
        DB = new HashMap<>();
        DB.put(1, new LinkedList<Vehicle>());
        DB.put(2, new LinkedList<Vehicle>());
        DB.put(3, new LinkedList<Vehicle>());
    }

    public void build(int type, String model){
        switch (type) {
            case 1:
               DB.get(type).add(MotorCycle.build(model));
               return;
            case 2:
                DB.get(type).add(Car.build(model));
                return;
            case 3:
                DB.get(type).add(Truck.build(model));
        }
    }

    public HashMap<Integer, Queue<Vehicle>> getVehicles(){
        return DB;
    }

}
