package task_8.travel_agency;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Hotel {
    private String HotelName;
    private List<Hotel> hotelList = new ArrayList<>();

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hotel hotel = (Hotel) o;
        return Objects.equals(HotelName, hotel.HotelName) &&
                Objects.equals(hotelList, hotel.hotelList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(HotelName, hotelList);
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "HotelName='" + HotelName + '\'' +
                '}';
    }
}
