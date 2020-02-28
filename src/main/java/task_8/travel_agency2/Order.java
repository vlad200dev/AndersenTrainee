package task_8.travel_agency2;

import task_8.travel_agency2.classes.*;

public class Order {
   private int id;
   private Client client;
   private Tour tour;

    public Order(Client client, Tour tour) {
        this.client = client;
        this.tour = tour;
    }

    public Order() {
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void setTour(Tour tour) {
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
