package task_10.travel_agency.dao;

import java.util.List;

public interface EntityDao <T>  {
    List<T> getEntity();
    void saveEntity(T theEntity);
    T findById(int theId);
    void deleteEntity(int theId);
}
