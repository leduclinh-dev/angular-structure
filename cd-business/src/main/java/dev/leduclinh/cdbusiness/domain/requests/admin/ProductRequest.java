package dev.leduclinh.cdbusiness.domain.requests.admin;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductRequest {

    private String name;
    private Integer price;
    private Integer quantity;
    private String image;
    private Long categoryId;
    private String description;
    private String code;

}
