package com.orca.workdemo.user.jpa.repository;

import com.orca.workdemo.user.jpa.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * created by yangyebo 2017-12-07 上午9:52
 */
@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long>{

}
