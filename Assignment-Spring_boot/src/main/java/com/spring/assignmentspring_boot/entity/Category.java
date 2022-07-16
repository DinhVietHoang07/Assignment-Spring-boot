package com.spring.assignmentspring_boot.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@Table(name = "caregories")
public class Category {
    @Id
    private String id;
    private String name;

}
