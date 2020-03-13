package task_10.travel_agency.dao;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import task_10.travel_agency.entities.Hotel;

import javax.persistence.EntityManager;
import java.util.List;
@Repository
public class HotelImpl implements EntityDao<Hotel> {

    @Autowired
    private EntityManager entityManager;


    @Override
    public List<Hotel> getEntity() {
        Session currentSession = entityManager.unwrap(Session.class);
        Query<Hotel> theQuery = currentSession.createQuery("FROM hotel", Hotel.class);
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
