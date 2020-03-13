package task_10.travel_agency.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import task_10.travel_agency.entities.Client;
import task_10.travel_agency.dao.EntityDao;

import java.util.List;
@Service
public class ClientServiceImpl implements EntityService<Client> {

    @Autowired
    private EntityDao<Client> clientEntityDao;

    @Override
    @Transactional
    public List<Client> getEntity() {
        return clientEntityDao.getEntity();
    }

    @Override
    @Transactional
    public void saveEntity(Client theEntity) {
        clientEntityDao.saveEntity(theEntity);
    }

    @Override
    @Transactional
    public Client findById(int theId) {
        return clientEntityDao.findById(theId);
    }

    @Override
    @Transactional
    public void deleteEntity(int theId) {
        clientEntityDao.deleteEntity(theId);
    }
}
