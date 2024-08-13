package com.ms.ecommerce.repository;

public class SuppliersRepositoryImpl {
    private SuppliersRepositoryImpl(){}
    private static SuppliersRepositoryImpl suppliersRepository;
    private static SuppliersRepositoryImpl getInstance(){
        if(suppliersRepository==null){
            suppliersRepository=new SuppliersRepositoryImpl();
            return suppliersRepository;
        }
        return suppliersRepository;
    }
}
