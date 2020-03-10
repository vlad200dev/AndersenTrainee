package task_8.travel_agency3.dao;

import org.hibernate.Session;
import org.hibernate.query.Query;
import task_8.travel_agency3.Client;

import javax.persistence.EntityManager;
import java.util.List;

public class ClientImpl implements EntityDao<Client> {

    private EntityManager entityManager;

    public ClientImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Client> getEntity() {
        Session currentSession = entityManager.unwrap(Session.class);
        Query<Client> theQuery = currentSession.createQuery("FROM client",Client.class);
        List<Client> clients = theQuery.getResultList();
        return clients;
    }

    @Override
    public void saveEntity(Client theEntity) {
        Session currentSession = entityManager.unwrap(Session.class);
        currentSession.saveOrUpdate(theEntity);
    }

    @Override
    public Client findById(int theId) {
        Session currentSession = entityManager.unwrap(Session.class);
        Client theClient = currentSession.get(Client.class, theId);
        return theClient;
    }

    @Override
    public void deleteEntity(int theId) {
        Session currentSession = entityManager.unwrap(Session.class);
        Query theQuery = currentSession.createQuery("delete FROM client WHERE id=:clientId");
        theQuery.setParameter("clientId", theId);
        theQuery.executeUpdate();
    }
}
