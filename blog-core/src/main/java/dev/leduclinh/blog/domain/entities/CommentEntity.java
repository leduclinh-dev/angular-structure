package dev.leduclinh.blog.domain.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.security.Timestamp;

@Entity
@Getter
@Setter
@Table(name = "comment")
public class CommentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "post_id", referencedColumnName = "id")
    private PostEntity post;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private UserEntity user;
    private String content;
    private Timestamp createdAt;

    public CommentEntity() {
    }
}
