package com.ms.ecommerce.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    private int productId;
    private String productNname ;
    private String description ;
    private int price;
    private int stockQuantity;
    private String categoryId;
    private String supplierId;


}

