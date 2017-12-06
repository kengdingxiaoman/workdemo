package com.orca.workdemo.jpa.repository;

import com.orca.workdemo.jpa.entity.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * created by yangyebo 2017-12-06 上午9:37
 */
@Repository
public interface BookRepository extends JpaRepository<BookEntity, Long>{

}
