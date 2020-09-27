package dev.leduclinh.cdbusiness.domain.dtos;

import dev.leduclinh.cdbusiness.domain.entities.CategoryEntity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CategoryDTO {

    private Long id;
    private String name;

    public CategoryDTO() {
    }

    public void buildResponse(CategoryEntity entity) {
        if (entity != null) {
          this.id = entity.getId();
          this.name = entity.getName();
        }
    }
}
