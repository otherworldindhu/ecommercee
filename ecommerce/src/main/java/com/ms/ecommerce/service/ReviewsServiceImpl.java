package com.ms.ecommerce.service;

public class ReviewsServiceImpl {
    private ReviewsServiceImpl(){}
    private static ReviewsServiceImpl reviewsService;
    public static ReviewsServiceImpl getInstance(){
        if(reviewsService==null){
            System.out.println("inside the if condition");
            reviewsService=new ReviewsServiceImpl();
            return reviewsService;
        }
        return reviewsService;
    }

}
