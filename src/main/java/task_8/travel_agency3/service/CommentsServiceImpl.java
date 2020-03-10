package task_8.travel_agency3.service;

import task_8.travel_agency3.Comments;
import task_8.travel_agency3.dao.EntityDao;

import java.util.List;

public class CommentsServiceImpl implements EntityService<Comments> {

    private EntityDao<Comments> commentEntityDao;

    @Override
    public List<Comments> getEntity() {
        return commentEntityDao.getEntity();
    }

    @Override
    public void saveEntity(Comments theEntity) {
        commentEntityDao.saveEntity(theEntity);
    }

    @Override
    public Comments findById(int theId) {
        return commentEntityDao.findById(theId);
    }

    @Override
    public void deleteEntity(int theId) {
        commentEntityDao.deleteEntity(theId);
    }
}
