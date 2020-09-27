package dev.leduclinh.cdbusiness.domain.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;
import java.sql.Timestamp;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "order")
public class OrderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_id", referencedColumnName = "id")
    private CustomerEntity customerId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private UserEntity userId;

    private Integer total;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "orderItem_id", referencedColumnName = "id")
    private List<OrderItemEntity> orderItemId;

    private Timestamp date;
}
