package com.ms.ecommerce;

import com.ms.ecommerce.dto.Customer;
import com.ms.ecommerce.dto.Product;
import com.ms.ecommerce.service.CustomerService;
import com.ms.ecommerce.service.CustomerServiceImpl;
import com.ms.ecommerce.service.ProductService;
import com.ms.ecommerce.service.ProductServiceImpl;

import java.sql.SQLException;


//import static com.ms.ecommerce.service.CustomerServiceImpl.customerService;

public class Main{
    public static void main(String [] args){
        CustomerService customerService= CustomerServiceImpl.getInstance();

        Customer customer=new Customer(1,"indhu","olive","just@gmail.com","9349","chennai");
        try {
            Customer customer2=customerService.addCustmer(customer);
        } catch (SQLException e) {
            System.out.println("exception caught");
            /*throw new RuntimeException(e);*/
            System.err.println(e.getMessage());
        }

        ProductService productService= ProductServiceImpl.getInstance();

        Product product=new Product(1,"umbrella","when it rains",655,3,"54","32");
        Product product2=productService.addProduct(product);



    }
}