package dev.potatoo.jpah2.repository;


import com.querydsl.jpa.impl.JPAQueryFactory;
import dev.potatoo.jpah2.domain.QUsers;
import dev.potatoo.jpah2.domain.Users;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Querydsl를 이용한 쿼리를 작성한다.
 */
@Repository
@RequiredArgsConstructor
public class UserRepositoryCustomImpl implements UserRepositoryCustom{
    private final JPAQueryFactory queryFactory;

    @Override
    public List<Users> queryDslFindUsers(){
        QUsers qUsers = QUsers.users;

        return queryFactory.selectFrom(qUsers)
                .fetch();
    };


}
