package dev.potatoo.jpah2.controller;

import dev.potatoo.jpah2.entity.Users;
import dev.potatoo.jpah2.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @RequestMapping("/getUsers")
    public List<Users> getUsers(@RequestParam(required = false, defaultValue = "") String name){
        return userService.getUsersService(name);
    }

    @PostMapping("/createUser")
    public String createUser(Users users){
        return userService.createUserService(users);
    }

}
