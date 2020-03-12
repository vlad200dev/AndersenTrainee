package task_10.travel_agency.dao;

import org.hibernate.Session;
import org.hibernate.query.Query;
import task_10.travel_agency.entities.Identification;

import javax.persistence.EntityManager;
import java.util.List;

public class IdentificationImpl implements EntityDao<Identification> {
    private EntityManager entityManager;

    public IdentificationImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Identification> getEntity() {
        Session currentSession = entityManager.unwrap(Session.class);
        Query<Identification> theQuery = currentSession.createQuery("FROM identification", Identification.class);
        List<Identification> identifications = theQuery.getResultList();
        return identifications;
    }

    @Override
    public void saveEntity(Identification theEntity) {
        Session currentSession = entityManager.unwrap(Session.class);
        currentSession.saveOrUpdate(theEntity);
    }

    @Override
    public Identification findById(int theId) {
        Session currentSession = entityManager.unwrap(Session.class);
        Identification theIdentification = currentSession.get(Identification.class, theId);
        return theIdentification;
    }

    @Override
    public void deleteEntity(int theId) {
        Session currentSession = entityManager.unwrap(Session.class);
        Query theQuery = currentSession.createQuery("delete FROM identification WHERE id=:identificationId");
        theQuery.setParameter("identificationId", theId);
        theQuery.executeUpdate();
    }
}
