package com.milsondev.stockservice.dtos;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@Data
@Document(collection = "categories")
public class Category {
        @Id
        private UUID id;
        private String categoryName;
        private int qtd;
        private String imageUrl;
}