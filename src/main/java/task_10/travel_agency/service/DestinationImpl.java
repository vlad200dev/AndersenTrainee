package task_10.travel_agency.service;

import task_10.travel_agency.entities.Destination;
import task_10.travel_agency.dao.EntityDao;

import java.util.List;

public class DestinationImpl implements EntityService<Destination> {

    private EntityDao<Destination> destinationEntityDao;

    @Override
    public List<Destination> getEntity() {
        return destinationEntityDao.getEntity();
    }

    @Override
    public void saveEntity(Destination theEntity) {
        destinationEntityDao.saveEntity(theEntity);
    }

    @Override
    public Destination findById(int theId) {
        return destinationEntityDao.findById(theId);
    }

    @Override
    public void deleteEntity(int theId) {
        destinationEntityDao.deleteEntity(theId);
    }
}
