package OCP;

public class Bus extends Vehice{
    public Bus(int maxspeed,String type){
        super(maxspeed, "Bus");
    }

    @Override
    public double calculateAllowedSpeed(){
        return super.maxspeed*0.5;
    }
}
