package task_8.travel_agency2.dao;

import task_8.travel_agency2.Order;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class OrderDaoImpl implements OrderDao {

    Connection connection = null;
    Statement statement = null;
    ResultSet resultset = null;
    Properties properties = null;

    private Statement makeConnect() {
        properties = new Properties();
        try {
            properties.load(new FileInputStream("C:\\AndersenTrainee\\AndersenTrainee\\src\\main\\resources\\connection.properties"));
            String user = properties.getProperty("user");
            String password = properties.getProperty("password");
            String dburl = properties.getProperty("dburl");
            connection = DriverManager.getConnection(dburl, user, password);
            statement = connection.createStatement();
        } catch (IOException | SQLException e) {
            e.printStackTrace();
        }
        return statement;
    }

    @Override
    public List<Order> getOrders() {
        List<Order> orders = new ArrayList<>();
        try {
            resultset = makeConnect().executeQuery("SELECT * FROM 'order'INNER JOIN ");
            while (resultset.next()){
                Order order = new Order();
                // to do
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public void saveOrder(Order theOrder) {

    }

    @Override
    public Order findById(int theId) {
        return null;
    }

    @Override
    public void deleteOrder(int theId) {

    }
}
