package task_8.travel_agency2.service;

import task_8.travel_agency2.Order;

import java.util.List;

public interface OrderService {
    List<Order> getOrders();
    void saveOrder(Order theOrder);
    Order findById(int theId);
    void deleteOrder(int theId);
}
