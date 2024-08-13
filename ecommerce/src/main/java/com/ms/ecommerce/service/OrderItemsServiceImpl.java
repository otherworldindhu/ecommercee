package com.ms.ecommerce.service;

import com.ms.ecommerce.repository.OrderItemsRepositoryImpl;

public class OrderItemsServiceImpl {
    private OrderItemsServiceImpl(){}
    private static OrderItemsServiceImpl orderItemsService;
    public static OrderItemsServiceImpl getInstance(){
        if(orderItemsService==null){
            System.out.println("inside the if condition");
            orderItemsService=new OrderItemsServiceImpl();
            return orderItemsService;
        }
        return orderItemsService;
    }
}
