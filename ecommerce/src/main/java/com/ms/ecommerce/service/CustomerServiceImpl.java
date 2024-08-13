package com.ms.ecommerce.service;

import com.ms.ecommerce.dto.Customer;
import com.ms.ecommerce.repository.CustomerRepository;
import com.ms.ecommerce.repository.CustomerRepositoryImpl;

import java.sql.SQLException;

public class CustomerServiceImpl implements CustomerService {
    private CustomerRepository customerRepository= CustomerRepositoryImpl.getInstance();
    private CustomerServiceImpl(){}
    private static CustomerServiceImpl customerService;
    public static CustomerServiceImpl getInstance(){
        if(customerService==null){
            System.out.println("inside the if condition");
            customerService=new CustomerServiceImpl();
            return customerService;
        }
        return customerService;
    }

    @Override
    public Customer addCustmer(Customer customer) throws SQLException {
        return customerRepository.addCustmer(customer);
        //return null;
    }

    @Override
    public Customer[] getAllCustomers() {
        return new Customer[0];
    }

    @Override
    public Customer getCustomerById(int id) {
        return customerRepository.getCustomerById(id);
      //  return null;
    }

    @Override
    public String deleteCustomerById(int id) {
        return "";
    }

    @Override
    public Customer updateCustomerById(int id, Customer customer) {
        return null;
    }
}
