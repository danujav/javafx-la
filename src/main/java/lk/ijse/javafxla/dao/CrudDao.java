package lk.ijse.javafxla.dao;

/*
    @author DanujaV
    @created 9/16/23 - 4:54 PM   
*/

import lk.ijse.javafxla.entity.Item;

import java.util.List;

public interface CrudDao <T, ID> {
    boolean save(T entity) throws Exception;

    boolean update(T entity) throws Exception;

    T search(ID id) throws Exception;

    boolean delete(ID id) throws Exception;

    List<T> getAll() throws Exception;
}
