package dev.leduclinh.cdbusiness.repositories;

import dev.leduclinh.cdbusiness.domain.entities.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<CategoryEntity, Long> {
}
