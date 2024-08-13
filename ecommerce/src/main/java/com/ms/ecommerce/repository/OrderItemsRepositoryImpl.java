package com.ms.ecommerce.repository;

public class OrderItemsRepositoryImpl {
    private OrderItemsRepositoryImpl(){}
    private static OrderItemsRepositoryImpl orderItemsRepository;
    private static OrderItemsRepositoryImpl getInstance(){
        if(orderItemsRepository==null){
            orderItemsRepository=new OrderItemsRepositoryImpl();
            return orderItemsRepository;
        }
        return orderItemsRepository;
    }
}
