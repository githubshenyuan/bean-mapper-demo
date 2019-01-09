package com.example.beandozerspringbootdemo.repostory;

import com.example.beandozerspringbootdemo.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * @author sh 2019/1/6 17:14
 * @version ideaIU-2018.2.5.win
 */
public interface UserRepostory extends JpaRepository<UserEntity, String> {

    @Query(value = "SELECT * from `user`  WHERE uuid in (:us)",nativeQuery=true)
    public List<UserEntity> getUser(@Param("us") List<String> us);
}
