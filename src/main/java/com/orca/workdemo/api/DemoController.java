package com.orca.workdemo.api;

import com.orca.workdemo.jpa.entity.BookEntity;
import com.orca.workdemo.jpa.repository.BookRepository;
import com.orca.workdemo.user.jpa.entity.UserEntity;
import com.orca.workdemo.user.jpa.repository.UserRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

/**
 * created by yangyebo 2017-12-06 上午9:35
 */
@Api("/orca")
@RequestMapping("/test")
@RestController
public class DemoController{

    private static final Logger logger = LoggerFactory.getLogger(DemoController.class);

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private UserRepository userRepository;

    @ApiOperation("查询图书")
    @GetMapping("/queryBooks")
    public ResponseEntity<Void> queryBooks() {
        List<BookEntity> bookEntities = bookRepository.findAll();

        if(CollectionUtils.isEmpty(bookEntities)) {
            return ResponseEntity.ok().build();
        }

        for(BookEntity bookEntity : bookEntities) {
            logger.info(ToStringBuilder.reflectionToString(bookEntity, ToStringStyle.SHORT_PREFIX_STYLE));
        }

        List<UserEntity> userEntities = userRepository.findAll();

        if(CollectionUtils.isEmpty(userEntities)) {
            return ResponseEntity.ok().build();
        }

        for(UserEntity userEntity : userEntities) {
            logger.info(ToStringBuilder.reflectionToString(userEntity, ToStringStyle.SHORT_PREFIX_STYLE));
        }

        return ResponseEntity.ok().build();
    }

    @ApiOperation("新增图书")
    @GetMapping("/addBook")
    public ResponseEntity<Void> addBook() {
        BookEntity bookEntity = new BookEntity();
        bookEntity.setBookId(2L);
        bookEntity.setBookName("西游记");
        bookEntity.setAuthor("吴承恩");
        bookEntity.setAvailNum(230L);
        bookEntity.setPublishTime(new Date());
        bookEntity.setCreateTime(new Date());
        bookEntity.setUpdateTime(new Date());

        bookRepository.save(bookEntity);

        return ResponseEntity.ok().build();
    }

    @ApiOperation("更新图书")
    @GetMapping("/updateBook")
    public ResponseEntity<Void> updateBookInfo() {

        List<BookEntity> bookEntities = bookRepository.findAll();

        if(CollectionUtils.isEmpty(bookEntities)) {
            return ResponseEntity.ok().build();
        }

        Long availNum = 0L;
        for(BookEntity bookEntity : bookEntities) {
            availNum = bookEntity.getAvailNum();
            availNum = availNum - 1;
            bookEntity.setAvailNum(availNum);
            bookRepository.saveAndFlush(bookEntity);
            logger.info(ToStringBuilder.reflectionToString(bookEntity, ToStringStyle.SHORT_PREFIX_STYLE));
        }

        return ResponseEntity.ok().build();
    }
}
