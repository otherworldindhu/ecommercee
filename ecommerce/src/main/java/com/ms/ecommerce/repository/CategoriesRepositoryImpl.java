package com.ms.ecommerce.repository;

public class CategoriesRepositoryImpl {
    private CategoriesRepositoryImpl(){}
    private static CategoriesRepositoryImpl categoriesRepository;
    private static CategoriesRepositoryImpl getInstance(){
        if(categoriesRepository==null){
            categoriesRepository=new CategoriesRepositoryImpl();
            return categoriesRepository;
        }
        return categoriesRepository;
    }
}
