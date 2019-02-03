package com.igorternyuk.dao;

import com.igorternyuk.mapper.ClientMapper;
import com.igorternyuk.models.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by zenko on 01.02.19.
 */

@Repository
public class ClientDAOImpl implements ClientDAO{
    @Autowired
    private JdbcTemplate jdbcTemplate;


    public List<Client> getAll() {
        String query = "SELECT * FROM client;";
        return jdbcTemplate.query(query, new ClientMapper());
    }
}
