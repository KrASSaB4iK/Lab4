package controller;

import model.User;
import org.springframework.web.bind.annotation.*;
import repository.UserRepository;

import java.util.List;

@RestController
@RequestMapping("/user-api/v1/users")
class UserController {

    private final UserRepository userRepository;

    UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    @GetMapping
    List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @PostMapping
    User addUser(@RequestBody User user) {
        return userRepository.save(user);
    }
}