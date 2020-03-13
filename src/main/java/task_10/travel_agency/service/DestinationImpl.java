package task_10.travel_agency.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import task_10.travel_agency.entities.Destination;
import task_10.travel_agency.dao.EntityDao;

import java.util.List;
@Service
public class DestinationImpl implements EntityService<Destination> {

    @Autowired
    private EntityDao<Destination> destinationEntityDao;

    @Override
    @Transactional
    public List<Destination> getEntity() {
        return destinationEntityDao.getEntity();
    }

    @Override
    @Transactional
    public void saveEntity(Destination theEntity) {
        destinationEntityDao.saveEntity(theEntity);
    }

    @Override
    @Transactional
    public Destination findById(int theId) {
        return destinationEntityDao.findById(theId);
    }

    @Override
    @Transactional
    public void deleteEntity(int theId) {
        destinationEntityDao.deleteEntity(theId);
    }
}
