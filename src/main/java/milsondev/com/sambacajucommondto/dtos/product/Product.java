package milsondev.com.sambacajucommondto.dtos.product;

import lombok.Data;

import java.util.UUID;

@Data
public class Product {
    private UUID id;
    private String productName;
    private Double price;
    private Double oldPrice;
    private int star;
    private String imageUrl;
}