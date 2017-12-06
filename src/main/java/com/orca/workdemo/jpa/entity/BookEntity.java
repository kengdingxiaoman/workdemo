package com.orca.workdemo.jpa.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * created by yangyebo 2017-12-06 上午9:35
 */
@Entity
@Table(name="book")
@NamedQuery(name="BookEntity.findAll", query="SELECT s FROM BookEntity s")
public class BookEntity implements Serializable{

    private static final long serialVersionUID = -3365234452811266474L;

    @Id
    @Column(name="book_id")
    private Long bookId; //书编号

    @Column(name="book_name")
    private String bookName; //书名

    @Column(name="avail_num")
    private Long availNum; //结算单金额

    @Column(name="author")
    private String author; //作者

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="publish_time")
    private Date publishTime; //出版日期

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="create_time")
    private Date createTime; //记录创建时间

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="update_time")
    private Date updateTime; //记录更新时间

    //getter and setter
    public void setBookId(Long bookId){
        this.bookId = bookId;
    }

    public Long getBookId(){
        return this.bookId;
    }

    public void setBookName(String bookName){
        this.bookName = bookName;
    }

    public String getBookName(){
        return this.bookName;
    }

    public void setAvailNum(Long availNum){
        this.availNum = availNum;
    }

    public Long getAvailNum(){
        return this.availNum;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public String getAuthor(){
        return this.author;
    }

    public void setPublishTime(Date publishTime){
        this.publishTime = publishTime;
    }

    public Date getPublishTime(){
        return this.publishTime;
    }

    public void setCreateTime(Date createTime){
        this.createTime = createTime;
    }

    public Date getCreateTime(){
        return this.createTime;
    }

    public void setUpdateTime(Date updateTime){
        this.updateTime = updateTime;
    }

    public Date getUpdateTime(){
        return this.updateTime;
    }
}
