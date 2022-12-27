package com.fb.facebookapi.Controller;

import com.fb.facebookapi.Entity.User;
import com.fb.facebookapi.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/api/userService")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/save")
    public User saveUserMetaData(@RequestBody User user) {
        return userService.submitMetaDataOfUser(user);
    }

    @GetMapping("/getUserDetails")
    public ArrayList<User> getAllUserDetails() {
        return userService.retrieveAllUserDetails();
    }

    @GetMapping("/getAllUsers/{userID}")
    public User getUserDetail(@PathVariable("userID") String userID) {
        return userService.getUserData(userID);
    }
}
