package task_10.travel_agency.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import task_10.travel_agency.entities.Identification;
import task_10.travel_agency.dao.EntityDao;

import java.util.List;
@Service
public class IdentificationServiceImpl implements EntityService<Identification> {

    @Autowired
    private EntityDao<Identification> identificationEntityDao;

    @Override
    @Transactional
    public List<Identification> getEntity() {
        return identificationEntityDao.getEntity();
    }

    @Override
    @Transactional
    public void saveEntity(Identification theEntity) {
        identificationEntityDao.saveEntity(theEntity);
    }

    @Override
    @Transactional
    public Identification findById(int theId) {
        return identificationEntityDao.findById(theId);
    }

    @Override
    @Transactional
    public void deleteEntity(int theId) {
        identificationEntityDao.deleteEntity(theId);
    }
}
