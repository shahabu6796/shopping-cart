package com.lafzafashion.shopping.cart.controller;

import com.lafzafashion.shopping.cart.entity.User;
import com.lafzafashion.shopping.cart.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:4200")
@Slf4j
public class UserController {
    private final UserService userService;

    @PostMapping("/login")
    public ResponseEntity<String> loginUser(@RequestBody User user) {
        log.info("login api has been called user id: " + user.getUserId() + " and password: " + user.getPassword());
        if (userService.validateUser(user.getUserId(), user.getPassword())) {
            return ResponseEntity.status(HttpStatus.OK).body("login Successfully");
        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Invalid user");
    }
}
