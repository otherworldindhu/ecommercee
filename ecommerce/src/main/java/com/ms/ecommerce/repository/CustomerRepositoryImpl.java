package com.ms.ecommerce.repository;

import com.ms.ecommerce.dto.Customer;
import com.ms.ecommerce.service.CustomerService;
import com.ms.ecommerce.utils.DBUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
/*import com.ms.ecommerce.service.CustomerService;
import com.ms.ecommerce.service.CustomerServiceImpl;*/

public class CustomerRepositoryImpl implements CustomerRepository {
   // private CustomerRepositoryImpl(){}
    //private static CustomerRepositoryImpl customerRepository;
    public static CustomerRepositoryImpl getInstance(){
        if(customerRepository==null){
            customerRepository=new CustomerRepositoryImpl();
            return customerRepository;
        }
        return customerRepository;
    }

    @Override
    public Customer addCustmer(Customer customer) throws SQLException {
        String insertStatement="insert into customers_table" + "(customer_id,first_name,last_name,email,phone,address)"+"values()";
        Connection connection = DBUtils.getConnection();
        PreparedStatement preparedStatement  =null;

        preparedStatement= connection.prepareStatement(insertStatement);
        preparedStatement.setInt(1,customer.getCustomerId());
        preparedStatement.setString(2,customer.getFirstName());
        preparedStatement.setString(3,customer.getLastName());
        preparedStatement.setString(4,customer.getEmail());
        preparedStatement.setString(5,customer.getPhone());
        preparedStatement.setString(6,customer.getAddress());

        int res= preparedStatement.executeUpdate();
        if(res>0){
            return customer;
        }
        DBUtils.closeConnection(connection);


        return null;
    }

    @Override
    public Customer[] getAllCustomers() {
        return new Customer[0];
    }

    @Override
    public Customer getCustomerById(int id) {
        return null;
    }

    @Override
    public String deleteCustomerById(int id) throws SQLException {
        String deleteStatement="delete from customers_table where customer_id=?";
        Connection connection = DBUtils.getConnection();
        PreparedStatement preparedStatement  =null;
        preparedStatement= connection.prepareStatement(deleteStatement);
        int res= preparedStatement.executeUpdate();
        if(res>0){
            return "success";
        }
        DBUtils.closeConnection(connection);
        return "failure";
    }

    @Override
    public Customer updateCustomerById(int id, Customer customer) {
        return null;
    }

    private ArrayList<Customer> customerList=new ArrayList();
    private CustomerRepositoryImpl(){};
    private static CustomerRepositoryImpl customerRepository;


    /*@Override
    public Customer addCustmer(Customer customer) {
        Customer customer1=null;
        if(customerList.add(customer)){
            customer1=customer;
            //return customer;
        }
        return customer1;
    }

    @Override
    public Customer[] getAllCustomers() {
        // list to array

        Customer[] array = customerList.toArray(new Customer[customerList.size()]);
        return array;
    }

    @Override
    public Customer getCustomerById(int id) {
        for (Customer customer : customerList) {
            if(customer.getCustomerId()==id){
                return customer;
            }
        }
        return null;           //if there's no matching id
    }

    @Override
    public String deleteCustomerById(int id) {
        Customer customer= this.getCustomerById(id);
        if(customer!=null){
            if(customerList.remove(customer)){
                return "success";
            }
            else{
                return "fail";
            }
        }
        return "not found";
    }

    @Override
    public Customer updateCustomerById(int id, Customer customer) {
        return null;
    }*/


}
