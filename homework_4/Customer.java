package homework_4;

public class Customer {
    private int id;
    private Ticket tickets;
    private CashProvider cashProvider;
    private long cardNumber;

    
    public Customer(int id, Ticket tickets, CashProvider cashProvider,long cardNumber) {
        this.id = id;
        this.tickets = tickets;
        this.cashProvider = cashProvider;
        this.cardNumber = cardNumber;
    }


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public Ticket getTickets() {
        return tickets;
    }


    public void setTickets(Ticket tickets) {
        this.tickets = tickets;
    }


    public CashProvider getCashProvider() {
        return cashProvider;
    }


    public void setCashProvider(CashProvider cashProvider) {
        this.cashProvider = cashProvider;
    }
    
    public long getCardNumber() {
        return cardNumber;
    }
    @Override
    public String toString() {
        return "Client { " +
                "id= " + id +               
                ", cardNumber= " + (String.format("%016d", cardNumber)) +
                " }";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || this.getClass() != o.getClass()) return false;
        Customer client = (Customer) o;
        return this.equals(client);
    }
}
