package dev.potatoo.jpah2.repository;


import dev.potatoo.jpah2.domain.Users;
import java.util.List;

/**
 * Querydsl로 작성할 쿼리는 이 곳에 시그니처를 선언하고 `~RepositoryImpl`에서 구현한다.
 */
public interface UserRepositoryCustom {
    List<Users> queryDslFindUsers();
}
