# workdemo

一个工程的demo，也为了平时自己测试一些功能使用。

## 用到的技术

spring-boot：作为基础框架进行搭建

swagger：没有前台页面，使用restfule访问暴露的api，用swagger可以方便的调用接口

jpa：使用jpa访问数据

db：数据库初始化语句用的是mysql，也可以根据自己的需要换成oracle也一样，
在application.yml的datasource配置中设置成：

      driver-class-name: oracle.jdbc.driver.OracleDriver
      url: ${JDBC_URL:jdbc:oracle:thin:@127.0.0.1:1521:orca}
      username: ${JDBC_USER:orcauser}
      password: ${JDBC_PASSWORD:orcauser}

数据库连接池：用的是HikariCP，号称最快的数据库连接池

