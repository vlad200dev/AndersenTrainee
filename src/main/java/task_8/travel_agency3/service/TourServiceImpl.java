package task_8.travel_agency3.service;

import task_8.travel_agency3.Tour;
import task_8.travel_agency3.dao.EntityDao;


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
