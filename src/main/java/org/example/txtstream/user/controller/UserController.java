package org.example.txtstream.user.controller;


import org.example.txtstream.user.model.UserModel;
import org.example.txtstream.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * createUser - This method is user to create user
     * @param userModel
     * @return
     */
    @PostMapping("/create")
    public ResponseEntity<UserModel> createUser(@RequestBody UserModel userModel) {
        UserModel createdUser = userService.createUser(userModel);
        return new ResponseEntity<>(createdUser, HttpStatus.CREATED);
    }


    /**
     * getUserById - This methode is user to get user details
     * @param userId
     * @return
     */
//    @GetMapping("get")
//    public ResponseEntity<UserModel> getUserById(@PathVariable Long userId) {
//        UserModel userModel = userService.getUserById(userId);
//        return new ResponseEntity<>( userModel , HttpStatus.CREATED);
//    }




}
