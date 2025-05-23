package dao;

import java.util.ArrayList;

public interface CurdDao<T,ID> extends SuperDao {
    boolean save(T t) throws Exception;

    boolean update(T t) throws Exception;

    boolean delete(ID id) throws Exception;

    T search(ID id) throws Exception;

    ArrayList<T> getAll() throws Exception;
}
