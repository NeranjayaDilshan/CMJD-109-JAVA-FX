package service;

import dto.CustomerDto;

public interface CustomerService extends SuperService{
 public String save(CustomerDto customerDto) throws Exception;
}
