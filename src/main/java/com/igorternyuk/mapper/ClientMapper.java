package com.igorternyuk.mapper;

import com.igorternyuk.models.Client;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by zenko on 03.02.19.
 */
public class ClientMapper implements RowMapper<Client> {
    public Client mapRow(ResultSet resultSet, int i) throws SQLException {
        Client client = new Client();
        client.setId(resultSet.getInt("id"));
        client.setName(resultSet.getString("name"));
        client.setAge(resultSet.getInt("age"));
        client.setEmail(resultSet.getString("email"));
        client.setPassword(resultSet.getString("password"));
        return client;
    }
}
