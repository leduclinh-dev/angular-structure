package dev.leduclinh.blog.domain.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;

@Getter
@Setter
@Entity
@Table(name = "post")
public class PostEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private UserEntity user;
    private String title;
    private Timestamp createdTime;
    private String content;
    private String thumbnail;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id",referencedColumnName = "id")
    private CategoryEntity category;

    private Integer numView;
    private Integer numLike;
    private Integer numComment;

    public PostEntity() {
    }

    public PostEntity(Long id) { this.id = id;}
}
