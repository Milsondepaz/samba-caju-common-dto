package com.milsondev.stockservice.dtos;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@Data
@Document(collection = "products")
public class Product {
    @Id
    private UUID id;
    private String productName;
    private Double price;
    private Double oldPrice;
    private int star;
    private String imageUrl;

    public String getProductName() {
        final int MAX_LENGTH = 84;
        if (productName != null && productName.length() > MAX_LENGTH) {
            return productName.substring(0, MAX_LENGTH) + "...";
        }
        return productName;
    }
}