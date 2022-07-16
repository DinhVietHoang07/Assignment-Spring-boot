package com.spring.assignmentspring_boot.entity;

import com.spring.assignmentspring_boot.entity.base.BaseEntity;
import com.spring.assignmentspring_boot.entity.enums.ProductStatus;
import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "products")
public class Product extends BaseEntity {
    @Id
     private String id;
     @ManyToOne
     @JoinColumn(name = "categories_id", updatable = false, insertable = false)
     private Category category;
     private String name;
     private String slug;
     private String description;
     private String detail;
     private String thumbnails;
     private BigDecimal price;
     @Enumerated(EnumType.ORDINAL)
     private ProductStatus status;

}
