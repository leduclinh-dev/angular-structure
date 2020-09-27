package dev.leduclinh.cdbusiness.domain.dtos;

import dev.leduclinh.cdbusiness.domain.entities.ProductEntity;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class ProductDTO {

    private Long id;
    private String name;
    private Integer price;
    private Integer quantity;
    private String image;
    private CategoryDTO category;
    private String description;
    private String code;

    public ProductDTO() {
    }

    public void buildResponse(ProductEntity entity) {
        if (entity != null){
            this.id = entity.getId();
            this.name = entity.getName();
            this.price = entity.getPrice();
            this.quantity = entity.getQuantity();
            this.image = entity.getImage();
            CategoryDTO categoryDTO = new CategoryDTO();
            categoryDTO.buildResponse(entity.getCategory());
            this.category = categoryDTO;
            this.description = entity.getDescription();
            this.code = entity.getCode();
        }
    }
}
