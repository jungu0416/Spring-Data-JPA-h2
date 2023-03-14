package dev.potatoo.jpah2;

import dev.potatoo.jpah2.domain.Users;
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
        users.setUsername("Kim");
        userRepository.save(users);

        users = new Users();
        users.setUsername("Lee");
        userRepository.save(users);

        users = new Users();
        users.setUsername("Kang");
        userRepository.save(users);

        users = new Users();
        users.setUsername("Choi");
        userRepository.save(users);

        users = new Users();
        users.setUsername("Kang Jungu");
        userRepository.save(users);

    }

}
