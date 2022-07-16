package com.example.springboot_assignment.entity;

import com.example.springboot_assignment.entity.base.BaseEntity;
import com.example.springboot_assignment.entity.myenum.ProductStatus;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "products")
public class Product extends BaseEntity {
    @Id

    private String id;
    private String name;
    private BigDecimal price;
    private String description;
    @Lob
    private String detail; // text
    private String thumbnails;
    @Enumerated(EnumType.ORDINAL)
    private ProductStatus status;
    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "category_id")
    @JsonManagedReference
    private Category category;

}
