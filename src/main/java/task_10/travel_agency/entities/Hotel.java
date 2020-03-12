package task_10.travel_agency.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "hotel")
public class Hotel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "hotel")
    private String hotel;

    @ManyToMany(fetch = FetchType.LAZY,
                cascade = {CascadeType.PERSIST,
                    CascadeType.MERGE,
                    CascadeType.DETACH,
                    CascadeType.REFRESH})
    @JoinTable(
            name = "tour_hotel",
            joinColumns = @JoinColumn(name = "hotel_id"),
            inverseJoinColumns = @JoinColumn(name = "tour_id")
    )
    private List<Tour> tours;


    public Hotel(String hotel) {
        this.hotel = hotel;
    }

    public Hotel() {
    }

    public void addTour(Tour theTour){
        if (tours == null){
            tours = new ArrayList<>();
        }
        tours.add(theTour);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Tour> getTours() {
        return tours;
    }

    public void setTours(List<Tour> tours) {
        this.tours = tours;
    }

    public String getHotel() {
        return hotel;
    }

    public void setHotel(String hotel) {
        this.hotel = hotel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hotel hotel1 = (Hotel) o;
        return id == hotel1.id &&
                Objects.equals(hotel, hotel1.hotel) &&
                Objects.equals(tours, hotel1.tours);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, hotel, tours);
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "id=" + id +
                ", hotel=" + hotel +
                ", tours=" + tours +
                '}';
    }
}
