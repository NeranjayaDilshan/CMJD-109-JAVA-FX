package service;

import java.util.ArrayList;

import dto.CustomerDto;

public interface CustomerService extends SuperService{
 public String save(CustomerDto customerDto) throws Exception;

 public ArrayList<CustomerDto> getAll() throws Exception;


}
