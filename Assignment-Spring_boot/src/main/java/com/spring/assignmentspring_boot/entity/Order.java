package com.spring.assignmentspring_boot.entity;

import com.spring.assignmentspring_boot.entity.base.BaseEntity;
import com.spring.assignmentspring_boot.entity.enums.OrderSimpleStatus;
import lombok.*;


import javax.persistence.*;
import java.math.BigDecimal;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
@Entity
@Table(name="orders")
public class Order extends BaseEntity {
    @Id
    private String id;
    private String userId;
    private BigDecimal totalPrice;
    @Enumerated(EnumType.ORDINAL)
    private OrderSimpleStatus status;
}
