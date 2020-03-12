package task_10.travel_agency.service;

import java.util.List;

public interface EntityService<T>  {
    List<T> getEntity();
    void saveEntity(T theEntity);
    T findById(int theId);
    void deleteEntity(int theId);
}
