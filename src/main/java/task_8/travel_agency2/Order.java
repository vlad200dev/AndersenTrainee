package task_8.travel_agency2;

public class Order {
   private Client client;
   private Tour tour;

    public Order(Client client, Tour tour) {
        this.client = client;
        this.tour = tour;
    }

    public Order composedFinalOrder(){
        return this;
    }

    @Override
    public String toString() {
        return "Order{" +
                "client=" + client +
                ", tour=" + tour +
                '}';
    }
}
