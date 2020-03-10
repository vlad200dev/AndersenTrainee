package task_8.travel_agency3.dao;

import org.hibernate.Session;
import org.hibernate.query.Query;
import task_8.travel_agency3.Hotel;

import javax.persistence.EntityManager;
import java.util.List;

public class HotelImpl implements EntityDao<Hotel> {
    private EntityManager entityManager;

    public HotelImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Hotel> getEntity() {
        Session currentSession = entityManager.unwrap(Session.class);
        Query<Hotel> theQuery = currentSession.createQuery("FROM hotel",Hotel.class);
        List<Hotel> hotels = theQuery.getResultList();
        return hotels;
    }

    @Override
    public void saveEntity(Hotel theEntity) {
        Session currentSession = entityManager.unwrap(Session.class);
        currentSession.saveOrUpdate(theEntity);
    }

    @Override
    public Hotel findById(int theId) {
        Session currentSession = entityManager.unwrap(Session.class);
        Hotel theHotel = currentSession.get(Hotel.class, theId);
        return theHotel;
    }

    @Override
    public void deleteEntity(int theId) {
        Session currentSession = entityManager.unwrap(Session.class);
        Query theQuery = currentSession.createQuery("delete FROM hotel WHERE id=:hotelId");
        theQuery.setParameter("hotelId", theId);
        theQuery.executeUpdate();
    }
}
