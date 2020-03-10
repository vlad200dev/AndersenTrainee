package task_8.travel_agency3.service;

import java.util.List;

public interface EntityService<T>  {
    List<T> getEntity();
    void saveEntity(T theEntity);
    T findById(int theId);
    void deleteEntity(int theId);
}
