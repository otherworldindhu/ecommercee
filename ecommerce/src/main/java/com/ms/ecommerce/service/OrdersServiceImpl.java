package com.ms.ecommerce.service;

public class OrdersServiceImpl {
    private OrdersServiceImpl(){}
    private static OrdersServiceImpl ordersService;
    public static OrdersServiceImpl getInstance(){
        if(ordersService==null){
            System.out.println("inside the if condition");
            ordersService=new OrdersServiceImpl();
            return ordersService;
        }
        return ordersService;
    }
}
