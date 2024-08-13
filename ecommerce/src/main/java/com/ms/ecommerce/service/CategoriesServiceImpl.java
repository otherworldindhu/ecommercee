package com.ms.ecommerce.service;

import com.ms.ecommerce.repository.CategoriesRepositoryImpl;

public class CategoriesServiceImpl {
    private CategoriesServiceImpl(){}
    private static CategoriesServiceImpl categoriesService;
    public static CategoriesServiceImpl getInstance(){
        if(categoriesService==null){
            System.out.println("inside the if condition");
            categoriesService=new CategoriesServiceImpl();
            return categoriesService;
        }
        return categoriesService;
    }
}
