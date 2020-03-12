package task_10.travel_agency.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "tour")
public class Tour {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    @Column(name = "tour_date")
    private Date date;


    @ManyToOne(cascade = {CascadeType.PERSIST,
            CascadeType.MERGE,
            CascadeType.DETACH,
            CascadeType.REFRESH})
    @JoinColumn(name = "client_id")
    private Client client;


    @OneToMany(fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    @JoinColumn(name = "tour_comment")
    private List<Comments> comments;


    @ManyToMany(fetch = FetchType.LAZY,
            cascade = {CascadeType.PERSIST,
            CascadeType.MERGE,
            CascadeType.DETACH,
            CascadeType.REFRESH})
    @JoinTable(
            name = "tour_destination",
            joinColumns = @JoinColumn(name = "tour_id"),
            inverseJoinColumns = @JoinColumn(name = "destination_id")
    )
    private List<Destination> destinations;


    @ManyToMany(fetch = FetchType.LAZY,
                cascade = {CascadeType.PERSIST,
                    CascadeType.MERGE,
                    CascadeType.DETACH,
                    CascadeType.REFRESH})
    @JoinTable(
            name = "tour_hotel",
            joinColumns = @JoinColumn(name = "tour_id"),
            inverseJoinColumns = @JoinColumn(name = "hotel_id")
    )
    private List<Hotel> hotels;



    public Tour(Date date) {
        this.date = date;
    }

    public Tour() {
    }

    public void addComment(Comments comment) {
        if (comments == null) {
            comments = new ArrayList<>();
        }
        comments.add(comment);
    }

    public void addDestination(Destination theDestination) {
        if (destinations == null) {
            destinations = new ArrayList<>();
        }
        destinations.add(theDestination);
    }

    public void addHotel(Hotel theHotel) {
        if (hotels == null) {
            hotels = new ArrayList<>();
        }
        hotels.add(theHotel);
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<Destination> getDestinations() {
        return destinations;
    }

    public void setDestinations(List<Destination> destinations) {
        this.destinations = destinations;
    }
    public List<Comments> getComments() {
        return comments;
    }

    public void setComments(List<Comments> comments) {
        this.comments = comments;
    }

    public List<Hotel> getHotels() {
        return hotels;
    }

    public void setHotels(List<Hotel> hotels) {
        this.hotels = hotels;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tour tour = (Tour) o;
        return id == tour.id &&
                Objects.equals(date, tour.date) &&
                Objects.equals(client, tour.client) &&
                Objects.equals(comments, tour.comments) &&
                Objects.equals(destinations, tour.destinations) &&
                Objects.equals(hotels, tour.hotels);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, date, client, comments, destinations, hotels);
    }

    @Override
    public String toString() {
        return "Tour{" +
                "id=" + id +
                ", date=" + date +
                ", client=" + client +
                ", comments=" + comments +
                ", destinations=" + destinations +
                ", hotels=" + hotels +
                '}';
    }
}
