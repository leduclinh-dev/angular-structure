package dev.leduclinh.cdbusiness.domain.entities;

import dev.leduclinh.cdbusiness.domain.requests.admin.ProductRequest;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "product")
public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Integer price;

    private Integer quantity;

    private String image;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id", referencedColumnName = "id")
    private CategoryEntity category;

    private String description;

    private String code;

    public ProductEntity(ProductRequest request) {
        this.name = request.getName();
        this.price = request.getPrice();
        this.quantity = request.getQuantity();
        this.image = request.getImage();
        this.category = new CategoryEntity(request.getCategoryId());
        this.description = request.getDescription();
        this.code = request.getCode();
    }

    public ProductEntity() {

    }
}
