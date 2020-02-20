package task_8.travel_agency;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Hotel {
    private String HotelName;
    private static List<Hotel> hotelList = new ArrayList<>();

    public Hotel(String hotelName) {
        this.HotelName = hotelName;
        hotelList.add(this);
    }

    public List<Hotel> getHotelList() {
        return hotelList;
    }

    public String getHotelName() {
        return HotelName;
    }

    public Hotel() {
    }

    @Override
    public String toString() {
        return HotelName;
    }
}
