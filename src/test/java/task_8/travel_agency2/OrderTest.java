package task_8.travel_agency2;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import task_8.travel_agency2.classes.*;
class OrderTest {

    @Test
    public void makeOrderSequenceTest(){
        Client MikeTyson = new Client("Mike","Tyson","8012554433");
        Hotel InterContinental = new Hotel("InterContinental");
        Country Mexico = new Country("Mexico");
        Comments high = new Comments("Level A");

        Tour firstTour = new Tour(Mexico,high,InterContinental);
        Order madeOrder = new Order(MikeTyson,firstTour);
        Order result = madeOrder.composedFinalOrder();
        // проверим что создан экземпляр класса заказ
        Assert.assertNotNull(result);

    }




}