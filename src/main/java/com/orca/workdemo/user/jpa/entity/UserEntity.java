package com.orca.workdemo.user.jpa.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * created by yangyebo 2017-12-07 上午9:50
 */
@Entity
@Table(name="user")
@NamedQuery(name="UserEntity.findAll", query="SELECT s FROM UserEntity s")
public class UserEntity implements Serializable{

    private static final long serialVersionUID = -768543126787192875L;

    @Id
    @Column(name="user_id")
    private Long userId; //用户id

    @Column(name="user_name")
    private String userName; //用户姓名

    @Column(name="sex")
    private Integer sex; //性别

    @Column(name="grade")
    private String grade; //等级

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="create_time")
    private Date createTime; //记录创建时间

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="update_time")
    private Date updateTime; //记录更新时间

    //getter and setter
    public void setUserId(Long userId){
        this.userId = userId;
    }

    public Long getUserId(){
        return this.userId;
    }

    public void setUserName(String userName){
        this.userName = userName;
    }

    public String getUserName(){
        return this.userName;
    }

    public void setSex(Integer sex){
        this.sex = sex;
    }

    public Integer getSex(){
        return this.sex;
    }

    public void setGrade(String grade){
        this.grade = grade;
    }

    public String getGrade(){
        return this.grade;
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
