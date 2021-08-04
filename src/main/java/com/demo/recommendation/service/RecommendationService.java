package com.demo.recommendation.service;

import com.demo.recommendation.repo.OrderRepo;
import com.demo.recommendation.response.RecommendationResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RecommendationService {

    @Autowired
    private OrderRepo repo;

    public List<RecommendationResponse> getRecommendations(final String productId) {
        List<RecommendationResponse> recommendations = repo.getRecommendations(productId);
        return recommendations.stream()
                .sorted((RecommendationResponse r1, RecommendationResponse r2) -> r2.getCount().compareTo(r1.getCount()))
                .limit(5).collect(Collectors.toList());

    }
}
