package com.example.userjwt.Controller;

import com.example.userjwt.Entity.User;
import com.example.userjwt.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(value = "/all")
    public ResponseEntity<List<User>> getAll(){
        return new ResponseEntity<>(userService.getAllUser(), HttpStatus.ACCEPTED);
    }
    @GetMapping(value = "/{username}")
    public ResponseEntity<User> getOneUser( @PathVariable String username){
        return new ResponseEntity<>(userService.getOneUser(username), HttpStatus.ACCEPTED);
    }
    @PutMapping(value = "/add")
    public ResponseEntity<User> addFavorite( @RequestBody User user) {
        return new ResponseEntity<>(userService.addUser(user), HttpStatus.OK);
    }
    @DeleteMapping(value = "/delete/{username}")
    public ResponseEntity<User> addFavorite( @PathVariable String username) {
        return new ResponseEntity<>(userService.removeUser(username), HttpStatus.OK);
    }


}
