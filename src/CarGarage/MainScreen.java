package CarGarage;

import java.util.*;

public class MainScreen {
    public static void start() {
        Scanner scanner = new Scanner(System.in);
        DB vehicleDB = new DB();
        System.out.println("press 1 for MotorCycle, press 2 for Car, press 3 for Truck, press -1 to finish");
        int option = scanner.nextInt();
        ArrayList<Vehicle> vehicleList = new ArrayList<Vehicle>();
        String name;
        while(option != -1) {
            switch (option) {
                case 1:
                    System.out.println("enter MotorCycle name");
                    name = scanner.next();
                    Vehicle Motor = new MotorCycle(name);
                    vehicleDB.build(option,name);
                   break;
                case 2:
                    System.out.println("enter Car name");
                    name = scanner.next();
                    Vehicle Car = new Car(name);
                    vehicleDB.build(option,name);
                    break;
                case 3:
                    System.out.println("enter Truck name");
                    name = scanner.next();
                    Vehicle Truck = new Truck(name);
                    vehicleDB.build(option,name);
                    break;
                default:
                    System.out.println("wrong option press again");
                    break;
            }
            System.out.println("press 1 for MotorCycle, press 2 for Car, press 3 for Truck, press -1 to finish");
            option = scanner.nextInt();
        }
        System.out.println("Garage is working :)");
        //Queue<Vehicle> vehicleQueue = new ArrayDeque<>(vehicleList);
        Garage garage = new Garage(protocolGarage,vehicleDB.getVehicles());
        garage.tick();
    }

    private static Protocol_Garage protocolGarage = new Protocol_Garage() {
        @Override
        public void fixed() {
            System.out.print("fixed " );
        }
    };
}
