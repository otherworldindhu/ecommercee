package com.ms.ecommerce.service;

import com.ms.ecommerce.dto.Product;
import com.ms.ecommerce.repository.ProductRepository;
import com.ms.ecommerce.repository.ProductRepositoryImpl;

import static com.ms.ecommerce.repository.ProductRepositoryImpl.productRepository;

public class ProductServiceImpl implements ProductService {
    private ProductRepository productRepository = ProductRepositoryImpl.getInstance();

    private ProductServiceImpl(){}
    private static ProductServiceImpl productService;
    public static ProductServiceImpl getInstance(){
        if(productService==null){
            System.out.println("inside the if condition");
            productService=new ProductServiceImpl();
            return productService;
        }
        return productService;
    }

    @Override
    public Product addProduct(Product product) {
        return productRepository.addProduct(product);
        //return null;
    }

    @Override
    public Product[] getAllProducts() {
        return new Product[0];
    }

    @Override
    public Product getProductById(int id) {
        return productRepository.getProductById(id);
        //return null;
    }

    @Override
    public String deleteProductById(int id) {
        return "";
    }

    @Override
    public Product updateProductById(int id, Product product) {
        return null;
    }
}
