package com.ms.ecommerce.service;

import com.ms.ecommerce.dto.Customer;
import com.ms.ecommerce.dto.Product;

public interface ProductService {
    public abstract Product addProduct(Product product );

    public Product[] getAllProducts();
    public Product getProductById(int id);
    public String deleteProductById(int id);
    public Product updateProductById(int id, Product product);

    //public default String test(){
    //return "hello";
    //}

}
