package dev.potatoo.jpah2.service;

import dev.potatoo.jpah2.domain.Users;
import dev.potatoo.jpah2.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public List<Users> getUsersService(String name){
        if(name.isEmpty()) return userRepository.findAll();
        else return userRepository.findFirst2ByUsernameLikeOrderByIdDesc(name);
    }

    public String createUserService(Users users){
        userRepository.save(users);
        return "Success !!!";
    }

    public List<Users> nativeQueryFindUsers(){
        return userRepository.nativeQueryFindUsers();
    }

    public List<Users> jpqlQueryFindUsers() {
        return userRepository.jpqlQueryFindUsers();
    }


}
