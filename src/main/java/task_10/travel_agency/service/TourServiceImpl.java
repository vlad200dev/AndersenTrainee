package task_10.travel_agency.service;

import task_10.travel_agency.entities.Tour;
import task_10.travel_agency.dao.EntityDao;

import java.util.List;

public class TourServiceImpl implements EntityService<Tour> {

    private EntityDao<Tour> tourEntityDao;

    @Override
    public List<Tour> getEntity() {
        return tourEntityDao.getEntity();
    }

    @Override
    public void saveEntity(Tour theEntity) {
        tourEntityDao.saveEntity(theEntity);
    }

    @Override
    public Tour findById(int theId) {
        return tourEntityDao.findById(theId);
    }

    @Override
    public void deleteEntity(int theId) {
        tourEntityDao.deleteEntity(theId);
    }
}
