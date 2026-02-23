package com.shop.pras.Services;

import com.shop.pras.Models.User;
import com.shop.pras.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Optional<User> findUserByPasswordForBase(String password, String baseLogin) {
        return userRepository.findByUserPasswordAndBase_BaseLogin(password, baseLogin);
    }
}
