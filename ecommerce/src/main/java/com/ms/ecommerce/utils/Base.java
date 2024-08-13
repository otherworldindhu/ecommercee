package com.ms.ecommerce.utils;

import lombok.Data;

@Data
public class Base {
    private String name;
    private int value;
    public Base(String name,int value){
        this.name=name;
        this.value=value;
        System.out.println("hello from Base");
    }
}
