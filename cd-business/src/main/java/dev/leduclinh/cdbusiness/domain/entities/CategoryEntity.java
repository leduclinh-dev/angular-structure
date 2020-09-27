package dev.leduclinh.cdbusiness.domain.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "category")
public class CategoryEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    public CategoryEntity(Long id) {
        this.id = id;
    }

    public CategoryEntity() {

    }
}
