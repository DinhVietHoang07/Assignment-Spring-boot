package com.spring.assignmentspring_boot.seeder;

import com.github.javafaker.Faker;
import com.spring.assignmentspring_boot.Repository.CategoryRepository;
import com.spring.assignmentspring_boot.entity.Category;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Component
@Slf4j
public class CategorySeeder {
    public static List<Category> categories;
    public static final int NUMBER_OF_CATEGORIES = 50;

    @Autowired
    CategoryRepository categoryRepository;

    public void generate(){
        log.debug("------------Seeding category-------------");
        Faker faker = new Faker();
        categories = new ArrayList<>();
        for (int i = 0; i < NUMBER_OF_CATEGORIES; i++) {
            categories.add(Category.builder()
                    .id(UUID.randomUUID().toString())
                    .name(faker.cat().name())
                    .build());
    }
        categoryRepository.saveAll(categories);
        log.debug("===================END OF SEEDING CATEGORY");
}}
