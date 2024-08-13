package com.ms.ecommerce.repository;

import com.ms.ecommerce.dto.Customer;

import java.sql.SQLException;

public interface CustomerRepository {
    public abstract Customer addCustmer( Customer customer ) throws SQLException;

    public Customer[] getAllCustomers();
    public Customer getCustomerById(int id);
    public String deleteCustomerById(int id) throws SQLException;
    public Customer updateCustomerById(int id, Customer customer);
}
