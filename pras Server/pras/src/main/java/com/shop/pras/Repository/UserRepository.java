package com.shop.pras.Repository;

import com.shop.pras.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    // Проверка пользователя по паролю и базе
    Optional<User> findByUserPasswordAndBase_BaseLogin(
            String userPassword,
            String baseLogin
    );
}
