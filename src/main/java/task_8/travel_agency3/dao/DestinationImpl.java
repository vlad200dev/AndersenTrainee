package task_8.travel_agency3.dao;

import org.hibernate.Session;
import org.hibernate.query.Query;
import task_8.travel_agency3.Destination;

import javax.persistence.EntityManager;
import java.util.List;

public class DestinationImpl implements EntityDao<Destination> {
    private EntityManager entityManager;

    public DestinationImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Destination> getEntity() {
        Session currentSession = entityManager.unwrap(Session.class);
        Query<Destination> theQuery = currentSession.createQuery("FROM destination",Destination.class);
        List<Destination> destinations = theQuery.getResultList();
        return destinations;
    }

    @Override
    public void saveEntity(Destination theEntity) {
        Session currentSession = entityManager.unwrap(Session.class);
        currentSession.saveOrUpdate(theEntity);
    }

    @Override
    public Destination findById(int theId) {
        Session currentSession = entityManager.unwrap(Session.class);
        Destination theDestination = currentSession.get(Destination.class, theId);
        return theDestination;
    }

    @Override
    public void deleteEntity(int theId) {
        Session currentSession = entityManager.unwrap(Session.class);
        Query theQuery = currentSession.createQuery("delete FROM destination WHERE id=:destinationId");
        theQuery.setParameter("destinationId", theId);
        theQuery.executeUpdate();
    }
}
