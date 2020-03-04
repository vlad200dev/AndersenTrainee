package task_8.travel_agency3;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "comments")
public class Comments {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "country")
    private String comments;
    @ManyToOne
    @JoinColumn(name = "tour_comment")
    private Tour tour;

    public Comments() {
    }

    public Comments(String comments) {
        this.comments = comments;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Tour getTour() {
        return tour;
    }

    public void setTour(Tour tour) {
        this.tour = tour;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Comments comments1 = (Comments) o;
        return id == comments1.id &&
                Objects.equals(comments, comments1.comments) &&
                Objects.equals(tour, comments1.tour);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, comments, tour);
    }

    @Override
    public String toString() {
        return "Comments{" +
                "id=" + id +
                ", comments='" + comments + '\'' +
                ", tour=" + tour +
                '}';
    }
}
