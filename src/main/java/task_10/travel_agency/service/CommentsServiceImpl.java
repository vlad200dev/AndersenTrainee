package task_10.travel_agency.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import task_10.travel_agency.entities.Comments;
import task_10.travel_agency.dao.EntityDao;

import java.util.List;

@Service
public class CommentsServiceImpl implements EntityService<Comments> {

    @Autowired
    private EntityDao<Comments> commentEntityDao;

    @Override
    @Transactional
    public List<Comments> getEntity() {
        return commentEntityDao.getEntity();
    }

    @Override
    @Transactional
    public void saveEntity(Comments theEntity) {
        commentEntityDao.saveEntity(theEntity);
    }

    @Override
    @Transactional
    public Comments findById(int theId) {
        return commentEntityDao.findById(theId);
    }

    @Override
    @Transactional
    public void deleteEntity(int theId) {
        commentEntityDao.deleteEntity(theId);
    }
}
