package task_8.travel_agency2.service;

import task_8.travel_agency2.Order;
import task_8.travel_agency2.dao.OrderDao;

import java.util.List;

public class OrderServiceImpl implements OrderService{

   private OrderDao orderDao;

    @Override
    public List<Order> getOrders() {
        return orderDao.getOrders();
    }

    @Override
    public void saveOrder(Order theOrder) {
        orderDao.saveOrder(theOrder);
    }

    @Override
    public Order findById(int theId) {
        return orderDao.findById(theId);
    }

    @Override
    public void deleteOrder(int theId) {
        orderDao.deleteOrder(theId);
    }
}
