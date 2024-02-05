package OCP;

public class MainOCP {
    public static void main(String[] args) {
        Vehice vehicle = new Vehice(300, "Train");
        printVehiceMaxSpeed(vehicle);
        vehicle = new Car(200);
        printVehiceMaxSpeed(vehicle);
       

    }    
    public static void printVehiceMaxSpeed(Vehice vehicle) {
        System.out.println(vehicle.type+" max_speed = " +vehicle.calculateAllowedSpeed());
    }
}
