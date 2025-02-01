package CarGarage;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;


public class Garage {

    private Protocol_Garage protocolGarage;
    private Queue<Vehicle> vehicleQueue;
    private int fixtime =0;
    private boolean isfinished = false;

    public Garage(Protocol_Garage protocolGarage, HashMap<Integer, Queue<Vehicle>> vehicleMap){
        this.protocolGarage =  protocolGarage;
        this.vehicleQueue =  MapToQueue(vehicleMap);
    }

    public Queue<Vehicle> MapToQueue(HashMap<Integer, Queue<Vehicle>> vehicleMap){
        Queue<Vehicle> mergedVehicleQueue = new LinkedList<>();
        mergedVehicleQueue.addAll(vehicleMap.get(1));
        mergedVehicleQueue.addAll(vehicleMap.get(2));
        mergedVehicleQueue.addAll(vehicleMap.get(3));
        return mergedVehicleQueue;

    }

    public void tick(){

        Runnable helloRunnable = new Runnable() {
            public void run(){
                if(isfinished)
                {
                    return;
                }
                if(!vehicleQueue.isEmpty()){
                    if(fixtime >= vehicleQueue.peek().getFixTime()){
                        vehicleQueue.peek().fixed();
                        protocolGarage.fixed();
                        System.out.println(vehicleQueue.peek());
                        vehicleQueue.remove();
                        fixtime = 0;
                        System.out.println("----------------------------GARAGE----------------------------");
                    }
                    else{
                        fixtime++;
                    }
                }
                else
                {
                    isfinished = true;
                    System.out.println("the Garage is empty");
                }
            }

        };

        ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
        executor.scheduleAtFixedRate(helloRunnable, 0, 1, TimeUnit.SECONDS);


    }
}
