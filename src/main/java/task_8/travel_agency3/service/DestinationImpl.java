package task_8.travel_agency3.service;

import task_8.travel_agency3.Destination;
import task_8.travel_agency3.dao.EntityDao;

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
