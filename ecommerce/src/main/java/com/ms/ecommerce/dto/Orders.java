package com.ms.ecommerce.dto;

import lombok.AccessLevel;
import lombok.Data;
//import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
@Data
public class Orders {
    private int orderId;
    private int customerId;
    //@Getter(AccessLevel.NONE
    @Setter(AccessLevel.NONE)
    private LocalDate orderDate;
    private int total_amount;
}
