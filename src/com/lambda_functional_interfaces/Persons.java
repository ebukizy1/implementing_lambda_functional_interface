package com.lambda_functional_interfaces;

public class Persons {
    private String description;
    private int stockQuantity;

    public Persons(String description, int stockQuantity) {
        this.description = description;
        this.stockQuantity = stockQuantity;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    @Override
    public String toString() {
        return "Persons{" +
                "description='" + description + '\'' +
                ", stockQuantity=" + stockQuantity +
                '}';
    }
}
