package task_10.travel_agency.dao;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import task_10.travel_agency.entities.Tour;

import javax.persistence.EntityManager;
import java.util.List;
@Repository
public class TourImpl implements EntityDao<Tour> {

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Tour> getEntity() {
        Session currentSession = entityManager.unwrap(Session.class);
        Query<Tour> theQuery = currentSession.createQuery("FROM tour", Tour.class);
        List<Tour> tours = theQuery.getResultList();
        return tours;
    }

    @Override
    public void saveEntity(Tour theEntity) {
        Session currentSession = entityManager.unwrap(Session.class);
        currentSession.saveOrUpdate(theEntity);
    }

    @Override
    public Tour findById(int theId) {
        Session currentSession = entityManager.unwrap(Session.class);
        Tour theTour = currentSession.get(Tour.class, theId);
        return theTour;
    }

    @Override
    public void deleteEntity(int theId) {
        Session currentSession = entityManager.unwrap(Session.class);
        Query theQuery = currentSession.createQuery("delete FROM tour WHERE id=:tourId");
        theQuery.setParameter("tourId", theId);
        theQuery.executeUpdate();
    }
}
