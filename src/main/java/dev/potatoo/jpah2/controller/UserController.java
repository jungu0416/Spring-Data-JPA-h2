package dev.potatoo.jpah2.controller;

import dev.potatoo.jpah2.domain.Users;
import dev.potatoo.jpah2.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;



    @PostMapping("/createUser")
    public ResponseEntity<String> createUser(Users users){
        return new ResponseEntity<>(userService.createUserService(users), HttpStatus.OK);
    }

    @RequestMapping("/getUsers") //JPA
    public ResponseEntity<List<Users>> getUsers(@RequestParam(required = false, defaultValue = "") String name){
        return new ResponseEntity<>(userService.getUsersService(name), HttpStatus.OK);
    }

    @PostMapping("/nativeQuery") //nativeQuery 사용
    public ResponseEntity<List<Users>> nativeQueryFindUsers(){
        return new ResponseEntity<>(userService.nativeQueryFindUsers(),HttpStatus.OK);
    }

    @PostMapping("/JPQL") // JPQL 사용
    public ResponseEntity<List<Users>> jpqlQueryFindUsers(){
        return new ResponseEntity<>(userService.jpqlQueryFindUsers(),HttpStatus.OK);
    }

    //@PostMapping("/querydsl") // querydsl 사용



}
