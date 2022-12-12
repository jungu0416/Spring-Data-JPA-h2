package dev.potatoo.jpah2.repository;

import dev.potatoo.jpah2.domain.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<Users, Long> {
    List<Users> findFirst2ByUsernameLikeOrderByIdDesc(String name);

    //nativeQuery 를 이용
    @Query(value="select * from Users", nativeQuery = true) // nativeQuery = false 하면 JPQL
    List<Users> nativeQueryFindUsers();

    //JPQL을 이용
    @Query(value="select u from Users u", nativeQuery = false) // JPQL 쿼리 사용
    List<Users> jpqlQueryFindUsers();

}
