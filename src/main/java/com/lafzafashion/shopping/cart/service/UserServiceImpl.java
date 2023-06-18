package com.lafzafashion.shopping.cart.service;

import com.lafzafashion.shopping.cart.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Override
    public boolean validateUser(String userId, String password) {
        if (userId.isEmpty() || password.isEmpty()) {
            return false;
        }
        return userRepository.findById(userId).isPresent();
    }
}
