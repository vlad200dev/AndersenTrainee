package task_10.travel_agency.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import task_10.travel_agency.entities.Tour;
import task_10.travel_agency.dao.EntityDao;

import java.util.List;
@Service
public class TourServiceImpl implements EntityService<Tour> {

    @Autowired
    private EntityDao<Tour> tourEntityDao;

    @Override
    @Transactional
    public List<Tour> getEntity() {
        return tourEntityDao.getEntity();
    }

    @Override
    @Transactional
    public void saveEntity(Tour theEntity) {
        tourEntityDao.saveEntity(theEntity);
    }

    @Override
    @Transactional
    public Tour findById(int theId) {
        return tourEntityDao.findById(theId);
    }

    @Override
    @Transactional
    public void deleteEntity(int theId) {
        tourEntityDao.deleteEntity(theId);
    }
}
