package com.demo.recommendation.repo;

import com.demo.recommendation.models.Orders;
import com.demo.recommendation.response.RecommendationResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepo extends JpaRepository<Orders,Integer> {

    @Query("select new com.demo.recommendation.response.RecommendationResponse(productId,productName,count(*)) from Orders where customerIp in (select customerIp from Orders where productId= :pid) and productId<> :pid group By productId,productName")
    public List<RecommendationResponse> getRecommendations(@Param("pid")final String productId);
}
