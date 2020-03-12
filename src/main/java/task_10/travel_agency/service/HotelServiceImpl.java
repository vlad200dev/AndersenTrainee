package task_10.travel_agency.service;

import task_10.travel_agency.entities.Hotel;
import task_10.travel_agency.dao.EntityDao;

import java.util.List;

public class HotelServiceImpl implements EntityService<Hotel> {

    private EntityDao<Hotel> hotelEntityDao;

    @Override
    public List<Hotel> getEntity() {
        return hotelEntityDao.getEntity();
    }

    @Override
    public void saveEntity(Hotel theEntity) {
        hotelEntityDao.saveEntity(theEntity);
    }

    @Override
    public Hotel findById(int theId) {
        return hotelEntityDao.findById(theId);
    }

    @Override
    public void deleteEntity(int theId) {
        hotelEntityDao.deleteEntity(theId);
    }
}
