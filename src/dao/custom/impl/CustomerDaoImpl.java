package dao.custom.impl;

import java.util.ArrayList;

import dao.CurdUtil;
import dao.custom.CustomerDao;
import entity.CustomerEntity;

public class CustomerDaoImpl implements CustomerDao {

    @Override
    public boolean save(CustomerEntity t) throws Exception {
        return CurdUtil.executeUpdate("INSERT INTO Customer VALUES(?,?,?,?,?,?,?,?,?)",
                t.getId(),
                t.getTitle(),
                t.getName(),
                t.getDob(),
                t.getSalary(),
                t.getAddress(),
                t.getCity(),
                t.getProvince(),
                t.getPostalCode());
    }

    @Override
    public boolean update(CustomerEntity t) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public boolean delete(String id) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    @Override
    public CustomerEntity search(String id) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'search'");
    }

    @Override
    public ArrayList<CustomerEntity> getAll() throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAll'");
    }

}
