package com.igorternyuk.config;

import com.igorternyuk.dao.ClientDAO;
import com.igorternyuk.dao.ClientDAOImpl;
import com.igorternyuk.services.ClientService;
import com.igorternyuk.services.ClientServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

/**
 * Created by zenko on 01.02.19.
 */
@Configuration
@ComponentScan(basePackages = {"com.igorternyuk.services", "com.igorternyuk.dao"})
public class ClientsConfig {
    @Bean
    public JdbcTemplate getJdbcTemplate(){
        return new JdbcTemplate(getDataSource());
    }

    @Bean
    public DataSource getDataSource(){
        DriverManagerDataSource source = new DriverManagerDataSource();
        source.setUrl("jdbc:mysql://localhost:3306/Clients?UseSll=false");
        source.setUsername("zenko");
        source.setPassword("1319");
        source.setDriverClassName("com.mysql.jdbc.Driver");
        return source;
    }
}
