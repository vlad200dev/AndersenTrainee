package task_10.travel_agency.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import task_10.travel_agency.entities.Hotel;
import task_10.travel_agency.dao.EntityDao;

import java.util.List;
@Service
public class HotelServiceImpl implements EntityService<Hotel> {

    @Autowired
    private EntityDao<Hotel> hotelEntityDao;

    @Override
    @Transactional
    public List<Hotel> getEntity() {
        return hotelEntityDao.getEntity();
    }

    @Override
    @Transactional
    public void saveEntity(Hotel theEntity) {
        hotelEntityDao.saveEntity(theEntity);
    }

    @Override
    @Transactional
    public Hotel findById(int theId) {
        return hotelEntityDao.findById(theId);
    }

    @Override
    @Transactional
    public void deleteEntity(int theId) {
        hotelEntityDao.deleteEntity(theId);
    }
}
