package task_8.travel_agency3;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "identification")
public class Identification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "passport")
    private String passport;
    @OneToOne(mappedBy = "identification", cascade = CascadeType.ALL)
    private Client client;

    public Identification(String passport) {
        this.passport = passport;
    }

    public Identification() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Identification that = (Identification) o;
        return id == that.id &&
                Objects.equals(passport, that.passport) &&
                Objects.equals(client, that.client);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, passport, client);
    }

    @Override
    public String toString() {
        return "Identification{" +
                "id=" + id +
                ", passport='" + passport + '\'' +
                ", client=" + client +
                '}';
    }
}
