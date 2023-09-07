package com.coelhospring.course.resources;

import com.coelhospring.course.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll() {
        User u = new User(1L, "Coelho", "coelho.gmail.com", "121312", "22223333");
        return ResponseEntity.ok().body(u);
    }
}
