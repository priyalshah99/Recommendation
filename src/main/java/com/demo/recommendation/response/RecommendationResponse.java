package com.demo.recommendation.response;

public class RecommendationResponse {
    private String productId;
    private String productName;
    private Long count;

    public RecommendationResponse(String productId, String productName, Long count) {
        this.productId = productId;
        this.productName = productName;
        this.count = count;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }
}
