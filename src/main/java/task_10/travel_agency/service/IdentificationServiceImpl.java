package task_10.travel_agency.service;

import task_10.travel_agency.entities.Identification;
import task_10.travel_agency.dao.EntityDao;

import java.util.List;

public class IdentificationServiceImpl implements EntityService<Identification> {

    private EntityDao<Identification> identificationEntityDao;

    @Override
    public List<Identification> getEntity() {
        return identificationEntityDao.getEntity();
    }

    @Override
    public void saveEntity(Identification theEntity) {
        identificationEntityDao.saveEntity(theEntity);
    }

    @Override
    public Identification findById(int theId) {
        return identificationEntityDao.findById(theId);
    }

    @Override
    public void deleteEntity(int theId) {
        identificationEntityDao.deleteEntity(theId);
    }
}
