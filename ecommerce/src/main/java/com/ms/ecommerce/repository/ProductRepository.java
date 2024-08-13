package com.ms.ecommerce.repository;

import com.ms.ecommerce.dto.Customer;
import com.ms.ecommerce.dto.Product;

public interface ProductRepository {
    public abstract Product addProduct( Product product);
    public Product[] getAllProducts();
    public Product getProductById(int id);
    public String deleteProductById(int id);
    public Product updateProductById(int id, Product product);
}



