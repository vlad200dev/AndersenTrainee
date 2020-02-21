package task_8.travel_agency2;


import lombok.EqualsAndHashCode;

import java.util.Objects;

@EqualsAndHashCode
public class Hotel {
    private String HotelName;

    public Hotel(String hotelName) {
        this.HotelName = hotelName;
    }

    @Override
    public String toString() {
        return HotelName;
    }

}
