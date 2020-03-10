package task_8.travel_agency3.service;

import task_8.travel_agency3.Client;
import task_8.travel_agency3.dao.EntityDao;

import java.util.List;

public class ClientServiceImpl implements EntityService<Client> {

    private EntityDao<Client> clientEntityDao;

    @Override
    public List<Client> getEntity() {
        return clientEntityDao.getEntity();
    }

    @Override
    public void saveEntity(Client theEntity) {
        clientEntityDao.saveEntity(theEntity);
    }

    @Override
    public Client findById(int theId) {
        return clientEntityDao.findById(theId);
    }

    @Override
    public void deleteEntity(int theId) {
        clientEntityDao.deleteEntity(theId);
    }
}
