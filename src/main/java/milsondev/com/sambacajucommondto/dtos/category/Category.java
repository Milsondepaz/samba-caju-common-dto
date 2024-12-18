package milsondev.com.sambacajucommondto.dtos.category;

import lombok.Data;

import java.util.UUID;

@Data
public class Category {
        private UUID id;
        private String categoryName;
        private int qtd;
        private String imageUrl;
}