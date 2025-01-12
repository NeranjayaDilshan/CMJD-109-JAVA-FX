package service.impl;

import dao.DaoFactory;
import dao.custom.CustomerDao;
import dto.CustomerDto;
import entity.CustomerEntity;
import service.CustomerService;

public class CustomerServiceImpl implements CustomerService {

    private CustomerDao customerDao = (CustomerDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.CUSTOMER);

    @Override
    public String save(CustomerDto customerDto) throws Exception {
        CustomerEntity customerEntity = new CustomerEntity(customerDto.getId(),
                customerDto.getTitle(), customerDto.getName(), customerDto.getDob(), customerDto.getSalary(),
                customerDto.getAddress(), customerDto.getCity(),
                customerDto.getProvince(), customerDto.getPostalCode());
        return customerDao.save(customerEntity) ? "Success" : "Fail";
    }

}
