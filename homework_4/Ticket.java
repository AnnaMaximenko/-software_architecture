package homework_4;
import java.util.Date;

public class Ticket {
    private long rootNumber;
    private int price;
    private Date dataStart;
    private Date dataStop;
    private int place;
    private boolean isValid;

    
    public Ticket(long rootNumber, int price, Date dataStart, Date dataStop, int place, boolean isValid) {
        this.rootNumber = rootNumber;
        this.price = price;
        this.dataStart = dataStart;
        this.dataStop = dataStop;
        this.place = place;
        this.isValid = isValid;
    }


    public long getRootNumber() {
        return rootNumber;
    }


    public void setRootNumber(long rootNumber) {
        this.rootNumber = rootNumber;
    }


    public int getPrice() {
        return price;
    }


    public void setPrice(int price) {
        this.price = price;
    }


    public Date getDataStart() {
        return dataStart;
    }


    public void setDataStart(Date dataStart) {
        this.dataStart = dataStart;
    }


    public Date getDataStop() {
        return dataStop;
    }


    public void setDataStop(Date dataStop) {
        this.dataStop = dataStop;
    }


    public int getPlace() {
        return place;
    }


    public void setPlace(int place) {
        this.place = place;
    }


    public boolean isValid() {
        return isValid;
    }


    public void setValid(boolean isValid) {
        this.isValid = isValid;
    }

    @Override
    public String toString() {
        return "Ticket" +
                " Route Number " + this.rootNumber +
                ", Place " + this.place +
                ", Price " + this.price + " rub." +
                ", Date " + this.dataStart +
                ", " + (this.isValid ? "Free" : "Busy");
    }


    public String toPrint() {
        return "Ticket" +
                "\nRoute Number " + this.rootNumber +
                "\nPlace " + this.place +
                "\nPrice " + this.price + "rub." +
                "\nDate " + this.dataStart;
    }

    public boolean equals(Ticket ticket) {
        boolean isIt = ticket != null
                && ticket.getRootNumber() == this.rootNumber
                && ticket.getPlace() == this.place
                && ticket.getPrice() == this.price
                && ticket.getDataStart() == this.dataStart
                && ticket.hashCode() == this.hashCode();

        if (isIt) {
            return true;
        }
        return false;
    }

    public boolean buy(Ticket ticket) {
        return true;
    }   

    public Ticket searchTicket(Ticket ticket){
        return ticket;
    }

    public boolean repealTicket(Ticket ticket){
        return false;
    }
}
