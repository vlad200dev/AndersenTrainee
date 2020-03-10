package task_8.travel_agency3.dao;

import java.util.List;

public interface EntityDao <T>  {
    List<T> getEntity();
    void saveEntity(T theEntity);
    T findById(int theId);
    void deleteEntity(int theId);
}
