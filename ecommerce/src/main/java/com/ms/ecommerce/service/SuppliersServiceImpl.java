package com.ms.ecommerce.service;

public class SuppliersServiceImpl {
    private SuppliersServiceImpl(){}
    private static SuppliersServiceImpl suppliersService;
    public static SuppliersServiceImpl getInstance(){
        if(suppliersService==null){
            System.out.println("inside the if condition");
            suppliersService=new SuppliersServiceImpl();
            return suppliersService;
        }
        return suppliersService;
    }
}
