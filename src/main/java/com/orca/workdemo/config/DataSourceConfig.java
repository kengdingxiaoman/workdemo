package com.orca.workdemo.config;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

/**
 * created by yangyebo 2017-12-06 上午9:34
 */
@Configuration
public class DataSourceConfig{

    @Bean(name = "bookDataSourceProperties")
    @Primary
    @ConfigurationProperties("spring.datasource.book")
    public DataSourceProperties bookDataSourceProperties() {
        return new DataSourceProperties();
    }

    @Bean(name = "userDataSourceProperties")
    @ConfigurationProperties("spring.datasource.user")
    public DataSourceProperties userDataSourceProperties() {
        return new DataSourceProperties();
    }

    @Primary
    @Bean(name = "bookDataSource")
    @Qualifier("bookDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.book")
    public DataSource bookDataSource() {
        return bookDataSourceProperties().initializeDataSourceBuilder().type(HikariDataSource.class).build();
    }

    @Bean(name = "userDataSource")
    @Qualifier("userDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.user")
    public DataSource userDataSource(DataSourceProperties properties) {
        return userDataSourceProperties().initializeDataSourceBuilder().type(HikariDataSource.class).build();
    }
}
