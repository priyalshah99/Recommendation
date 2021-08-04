package com.demo.recommendation.controller;

import com.demo.recommendation.response.RecommendationResponse;
import com.demo.recommendation.service.RecommendationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RecommendationController {

    @Autowired
    private RecommendationService recommendationService;

    @GetMapping("/recommendation")
    public List<RecommendationResponse> recommendations(@RequestParam(name = "productId") final String productId) {
        return recommendationService.getRecommendations(productId);
    }
}
