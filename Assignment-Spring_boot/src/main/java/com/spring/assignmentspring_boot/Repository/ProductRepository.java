package com.spring.assignmentspring_boot.Repository;

import com.spring.assignmentspring_boot.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, String> {
}
