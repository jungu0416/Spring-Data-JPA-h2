package dev.potatoo.jpah2;

import dev.potatoo.jpah2.entity.Users;
import dev.potatoo.jpah2.repository.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

@DataJpaTest
class JpaApplicationTests {

    @Autowired
    UserRepository userRepository;

    @BeforeEach
    void insertTestData(){
        Users users = new Users();
        users.setUsername("Kim bob");
        userRepository.save(users);

        users = new Users();
        users.setUsername("Lee bob");
        userRepository.save(users);

        users = new Users();
        users.setUsername("Kang bob");
        userRepository.save(users);

        users = new Users();
        users.setUsername("Choi bob");
        userRepository.save(users);

        users = new Users();
        users.setUsername("Kang Jungu");
        userRepository.save(users);

    }

    @Test
    void findAllTest() {
        List<Users> usersList = userRepository.findAll();
        for(Users u : usersList) System.out.println(" findAll method ---> " + u.getId() + " | "+ u.getUsername());
    }

    @Test
    void find2ByNameTest() { // Like 검색으로 2개만 가져오기
        List<Users> usersList = userRepository.findFirst2ByUsernameLikeOrderByIdDesc("Kang%");
        for(Users u : usersList) System.out.println("" + u.getId() + " | " +u.getUsername());
    }

}
