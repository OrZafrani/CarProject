package CarGarage;
import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;


public class Garage {

    private Protocol_Garage protocolGarage;
    private Queue<Vehicle> vehicleQueue;
    private int fixtime =0;

    public Garage(Protocol_Garage protocolGarage, Queue<Vehicle> vehicleQueue){
        this.protocolGarage =  protocolGarage;
        this.vehicleQueue =  vehicleQueue;
    }

    public void tick(){

        Runnable helloRunnable = new Runnable() {
            public void run(){
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
                System.out.println("the Garage is empty");
                System.exit(1);
                }
            }

        };

        ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
        executor.scheduleAtFixedRate(helloRunnable, 0, 1, TimeUnit.SECONDS);

    }
}
