package com.spring.assignmentspring_boot.Repository;

import com.spring.assignmentspring_boot.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, String> {
}
