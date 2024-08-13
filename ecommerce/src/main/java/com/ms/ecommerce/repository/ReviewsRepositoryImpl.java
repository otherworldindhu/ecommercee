package com.ms.ecommerce.repository;

public class ReviewsRepositoryImpl {
    private ReviewsRepositoryImpl(){}
    private static ReviewsRepositoryImpl reviewsRepository;
    private static ReviewsRepositoryImpl getInstance(){
        if(reviewsRepository==null){
            reviewsRepository=new ReviewsRepositoryImpl();
            return reviewsRepository;
        }
        return reviewsRepository;
    }
}
