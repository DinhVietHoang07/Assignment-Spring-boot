package com.spring.assignmentspring_boot.seeder;

import com.github.javafaker.Faker;
import com.spring.assignmentspring_boot.Repository.OrderRepository;
import com.spring.assignmentspring_boot.entity.Order;
import com.spring.assignmentspring_boot.entity.enums.OrderSimpleStatus;
import com.spring.assignmentspring_boot.util.NumberUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Component
@Slf4j
public class OrderSeeder {
    public static List<Order> orders;
    public static final int NUMBER_OF_ORDER = 100;

    @Autowired
    OrderRepository orderRepository;

    public void generate() {
        log.debug("------------Seeding order-------------");
        Faker faker = new Faker();
        orders = new ArrayList<>();
        for (int i = 0; i < NUMBER_OF_ORDER; i++) {
            orders.add(Order.builder()
                    .id(UUID.randomUUID().toString())
                    .userId(faker.name().name())
                    .totalPrice(new BigDecimal(NumberUtil.getRandomNumber(100, 1000) * 1000))
                    .status(OrderSimpleStatus.PENDING)
                    .build());
        }
        orderRepository.saveAll(orders);
        log.debug("--------------End of seeding order-------------");
    }
}
