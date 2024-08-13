package com.ms.ecommerce.repository;

import com.ms.ecommerce.dto.Customer;
import com.ms.ecommerce.dto.Product;

import java.util.ArrayList;

public class ProductRepositoryImpl implements ProductRepository {
    //private ProductRepositoryImpl(){}
    //private static ProductRepositoryImpl productRepository;
    public static ProductRepositoryImpl getInstance(){
        if(productRepository==null){
            productRepository=new ProductRepositoryImpl();
            return productRepository;
        }
        return productRepository;
    }
    private ArrayList<Product> productList=new ArrayList();
    private ProductRepositoryImpl(){};
    public static ProductRepositoryImpl productRepository;


    @Override
    public Product addProduct(Product product) {
        Product product1=null;
        if(productList.add(product)){
            product1=product;
            //return customer;
        }
        return product1;
        //return null;
    }

    @Override
    public Product[] getAllProducts() {
        Product[] array = productList.toArray(new Product[productList.size()]);
        return array;
        //return new Product[0];
    }

    @Override
    public Product getProductById(int id) {
        for (Product product : productList) {
            if(product.getProductId()==id){
                return product;
            }
        }
        return null;
        //return null;
    }

    @Override
    public String deleteProductById(int id) {
        Product product= this.getProductById(id);
        if(product!=null){
            if(productList.remove(product)){
                return "success";
            }
            else{
                return "fail";
            }
        }
        return "not found";
        //return "";
    }

    @Override
    public Product updateProductById(int id, Product product) {
        return null;
    }
}
