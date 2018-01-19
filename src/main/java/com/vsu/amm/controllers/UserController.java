package com.vsu.amm.controllers;

import com.vsu.amm.entities.PlaceEntity;
import com.vsu.amm.entities.UserEntity;
import com.vsu.amm.json.UserJson;
import com.vsu.amm.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

/**
 * Created by antiz_000 on 11/13/2017.
 */

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/{id}")
    public UserJson getBasicInfo(@PathVariable(value = "id") String id) {
        return new UserJson(userService.findUserById(Long.parseLong(id)));
    }

    @RequestMapping("/create")
    public UserEntity test(@RequestParam(value = "login") String login,
                           @RequestParam(value = "pass") String pass,
                           @RequestParam(value = "firstName") String firstName,
                           @RequestParam(value = "lastName") String lastName) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        return userService.createUser(login, firstName, lastName, pass);
    }
}
