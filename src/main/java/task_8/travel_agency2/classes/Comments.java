package task_8.travel_agency2.classes;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class Comments {

    private String comments;

    public Comments(String comments) {
        this.comments = comments;
    }

    @Override
    public String toString() {
        return comments;
    }
}
