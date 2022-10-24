package com.example.gccoffee.repository;

import com.example.gccoffee.model.UserAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserAccountRepository extends JpaRepository<UserAccount, String> {}
