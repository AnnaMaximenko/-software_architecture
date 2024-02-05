package OCP;

public class Vehice {

    public int maxspeed;

    public String type;

    public Vehice(int maxspeed, String type) {
        this.maxspeed = maxspeed;
        this.type=type;    
    }

    public double calculateAllowedSpeed() {
        return maxspeed;
    }

    
}
