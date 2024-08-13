package com.ms.ecommerce.repository;

public class OrdersRepositoryImpl {
    private OrdersRepositoryImpl(){}
    private static OrdersRepositoryImpl ordersRepository;
    private static OrdersRepositoryImpl getInstance(){
        if(ordersRepository==null){
            ordersRepository=new OrdersRepositoryImpl();
            return ordersRepository;
        }
        return ordersRepository;
    }
}
