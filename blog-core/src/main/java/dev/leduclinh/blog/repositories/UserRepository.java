package dev.leduclinh.blog.repositories;

import dev.leduclinh.blog.domain.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
}
