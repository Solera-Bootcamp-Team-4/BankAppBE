package com.solera.team4.bancappbe.user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @GetMapping("/api/users")
    public List<User> users(String name) {
        return User.deserializeUsers();
    }

}
