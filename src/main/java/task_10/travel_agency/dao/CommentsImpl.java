package task_10.travel_agency.dao;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import task_10.travel_agency.entities.Comments;

import javax.persistence.EntityManager;
import java.util.List;
@Repository
public class CommentsImpl implements EntityDao<Comments> {

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Comments> getEntity() {
        Session currentSession = entityManager.unwrap(Session.class);
        Query<Comments> theQuery = currentSession.createQuery("FROM comments", Comments.class);
        List<Comments> comments = theQuery.getResultList();
        return comments;
    }

    @Override
    public void saveEntity(Comments theEntity) {
        Session currentSession = entityManager.unwrap(Session.class);
        currentSession.saveOrUpdate(theEntity);
    }

    @Override
    public Comments findById(int theId) {
        Session currentSession = entityManager.unwrap(Session.class);
        Comments theComment = currentSession.get(Comments.class, theId);
        return theComment;
    }

    @Override
    public void deleteEntity(int theId) {
        Session currentSession = entityManager.unwrap(Session.class);
        Query theQuery = currentSession.createQuery("delete FROM comments WHERE id=:commentId");
        theQuery.setParameter("commentId", theId);
        theQuery.executeUpdate();
    }
}
