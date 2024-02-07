package homework_4;

public class CashProvider {
    private long card;
    private boolean isAuthorization;

    
    public CashProvider(long card, boolean isAuthorization) {
        this.card = card;
        this.isAuthorization = isAuthorization;
    }
    public long getCard() {
        return card;
    }
    public void setCard(long card) {
        this.card = card;
    }
    public boolean isAuthorization() {
        return isAuthorization;
    }
    public void setAuthorization(boolean isAuthorization) {
        this.isAuthorization = isAuthorization;
    }
    @Override
    public String toString() {
        return "CashProvider [card=" + card + ", isAuthorization=" + isAuthorization + "]";
    }

    public boolean buy(int price){
        return true;
    }

    public boolean repealTicket(int price){
        return false;
    }
    public void authorization(Customer client) {
        card = client.getCardNumber();
        isAuthorization = true;
    }


}
