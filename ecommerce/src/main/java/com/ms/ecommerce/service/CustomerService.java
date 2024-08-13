package com.ms.ecommerce.service;
import com.ms.ecommerce.dto.Customer;

import java.sql.SQLException;

//@FunctionalInterface
public interface CustomerService {
    public abstract Customer addCustmer( Customer customer ) throws SQLException;

    public Customer[] getAllCustomers();
    public Customer getCustomerById(int id);
    public String deleteCustomerById(int id);
    public Customer updateCustomerById(int id, Customer customer);

    //public default String test(){
        //return "hello";
    //}
}
