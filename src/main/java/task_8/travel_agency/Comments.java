package task_8.travel_agency;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Comments {

    private String comments;
    private List<Comments> commentsList = new ArrayList<>();

    public Comments(String comments) {
        this.comments = comments;
        commentsList.add(this);
    }

    public Comments() {
    }

    public List<Comments> getCommentsList() {
        return commentsList;
    }

    public String getComments() {
        return comments;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Comments comments1 = (Comments) o;
        return Objects.equals(comments, comments1.comments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(comments);
    }

    @Override
    public String toString() {
        return "Comments{" +
                "comments='" + comments + '\'' +
                '}';
    }
}
