package com.spring.assignmentspring_boot.Repository;

import com.spring.assignmentspring_boot.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
    Account findByUsername(String username);
}
