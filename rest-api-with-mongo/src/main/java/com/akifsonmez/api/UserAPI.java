package com.akifsonmez.api;

import com.akifsonmez.entity.User;
import com.akifsonmez.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserAPI {


    private final UserService userService;

    @PostConstruct
    private void init() {
        HashMap<String, String> properties = new HashMap<>();
        properties.put("prop1", "prop1Value");
        userService.addUser(new User("0", "Akif", "Sönmez", properties));
        userService.addUser(new User("1", "Akif", "Sönmez", properties));
    }

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable String id) {
        return userService.getUser(id).orElse(null);
    }

    @PostMapping
    public void addUser(@RequestBody User user) {
        userService.addUser(user);
    }

    @PutMapping("/{id}")
    public void updateUser(@PathVariable String id, @RequestBody User user) {
        userService.updateUser(id, user);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable String id) {
        userService.deleteUser(id);
    }
}
