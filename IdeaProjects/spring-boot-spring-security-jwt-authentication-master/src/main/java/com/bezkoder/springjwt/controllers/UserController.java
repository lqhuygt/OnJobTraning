package com.bezkoder.springjwt.controllers;

import com.bezkoder.springjwt.models.Role;
import com.bezkoder.springjwt.models.User;
import com.bezkoder.springjwt.repository.RoleRepository;
import com.bezkoder.springjwt.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    UserRepository userRepository;

    @Autowired
    RoleRepository roleRepository;

    @GetMapping("")
    public ResponseEntity<List<User>> getAll() {
        List<User> userList = (List<User>) userRepository.findAll();
        return new ResponseEntity<>(userList, HttpStatus.OK);
    }

    @GetMapping("/role")
    public ResponseEntity<List<Role>> getRole() {
        List<Role> roleList = (List<Role>) roleRepository.findAll();
        return new ResponseEntity<>(roleList, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<Object> getUserById(@PathVariable("id") Long id) {
        System.out.println("Fetching User with id " + id);
        Optional<User> user = userRepository.findById(id);
        if (user == null){
            return new ResponseEntity<Object>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Object>(user,HttpStatus.OK);
    }

    @PutMapping("/{id}")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<String> updateUser(@PathVariable("id") Long id,
                                                 @Valid @RequestBody User user){
        System.out.println("Updating User " + id);
        Optional<User> oldUser = userRepository.findById(id);
        if (oldUser == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        User currently = oldUser.get();
        currently.setId(user.getId());
        currently.setUsername(user.getUsername());
        currently.setEmail(user.getEmail());
        currently.setRoles(user.getRoles());
        userRepository.save(currently);

        return new ResponseEntity<>("Updated!", HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<User> deleteUser(@PathVariable("id") Long id) {
        Optional<User> user = userRepository.findById(id);
        if(user == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        userRepository.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
