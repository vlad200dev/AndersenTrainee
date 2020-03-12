package task_10.travel_agency.service;

import task_10.travel_agency.entities.Client;
import task_10.travel_agency.dao.EntityDao;

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
