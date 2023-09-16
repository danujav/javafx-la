package lk.ijse.javafxla.dao.custom.impl;

/*
    @author DanujaV
    @created 9/16/23 - 4:57 PM   
*/

import lk.ijse.javafxla.dao.custom.CustomerDao;
import lk.ijse.javafxla.entity.Customer;

import java.util.List;

public class CustomerDaoImpl implements CustomerDao {
    @Override
    public boolean save(Customer entity) throws Exception {
        return false;
    }

    @Override
    public boolean update(Customer entity) throws Exception {
        return false;
    }

    @Override
    public Customer search(String s) throws Exception {
        return null;
    }

    @Override
    public boolean delete(String s) throws Exception {
        return false;
    }

    @Override
    public List<Customer> getAll() throws Exception {
        return null;
    }
}
