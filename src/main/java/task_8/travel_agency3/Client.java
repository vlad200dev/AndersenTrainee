package task_8.travel_agency3;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "client")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @OneToOne(fetch = FetchType.LAZY,
                cascade = CascadeType.ALL)
    @JoinColumn(name = "identification_id")
    private Identification identification;

    @OneToMany( mappedBy = "client",
                cascade = {CascadeType.PERSIST,
                        CascadeType.MERGE,
                        CascadeType.DETACH,
                        CascadeType.REFRESH})
    private List<Tour> tours;

    public Client(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Client() {
    }

    public void add(Tour tmpTour){
        if (tours ==null){
            tours = new ArrayList<>();
        }
        tours.add(tmpTour);
        tmpTour.setClient(this);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Identification getIdentification() {
        return identification;
    }

    public void setIdentification(Identification identification) {
        this.identification = identification;
    }

    public List<Tour> getTours() {
        return tours;
    }

    public void setTours(List<Tour> tours) {
        this.tours = tours;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return id == client.id &&
                Objects.equals(name, client.name) &&
                Objects.equals(surname, client.surname) &&
                Objects.equals(identification, client.identification);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname, identification);
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", identification=" + identification +
                '}';
    }
}
