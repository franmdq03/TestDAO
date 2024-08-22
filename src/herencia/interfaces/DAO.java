package herencia.interfaces;

import java.util.List;

public interface DAO<T> {

    public void create(T t);

    public void update(T t, int id);

    public void delete(int id);

    public T readById(int id);

    public List<T> readAll();
}
