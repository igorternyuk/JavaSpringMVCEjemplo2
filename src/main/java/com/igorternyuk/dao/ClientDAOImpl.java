package com.igorternyuk.dao;

import com.igorternyuk.mapper.ClientMapper;
import com.igorternyuk.models.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by zenko on 01.02.19.
 */

@Repository
public class ClientDAOImpl implements ClientDAO{
    private static final String SQL_ADD_NEW = "INSERT INTO client VALUES(null,?,?,?,?);";
    private static final String SQL_GET_BY_ID = "SELECT * FROM client WHERE id=?;";
    private static final String SQL_GET_ALL = "SELECT * FROM client;";
    private static final String SQL_FIND_BY_NAME = "SELECT * FROM client WHERE name LIKE :filter OR email LIKE :filter;";
    private static final String SQL_UPDATE = "UPDATE client SET name=?, age=?,email=?,password=? WHERE id=?;";
    private static final String SQL_REMOVE = "DELETE FROM client WHERE id=?;";

    @Autowired
    private JdbcTemplate jdbcTemplate;


    public void addNew(Client client) {
        jdbcTemplate.update(SQL_ADD_NEW, client.getName(), client.getAge(),
                client.getEmail(), client.getPassword());
    }

    public void update(Client client) {
        jdbcTemplate.update(SQL_UPDATE, client.getName(), client.getAge(),
                client.getEmail(), client.getPassword(), client.getId());
    }

    public Client getById(int id) {
        return jdbcTemplate.queryForObject(SQL_GET_BY_ID, new ClientMapper(), id);
    }

    public List<Client> findByName(String filter) {
        String sql = "SELECT * FROM client WHERE name LIKE '%"+ filter + "%' OR email LIKE '%"+ filter + "%';";
        /*
        * Map<String,Object> params = new HashMap<String,Object>();
    params.put("codes", codes);
    params.put("name", namePart+"%");
    return getSimpleJdbcTemplate().query(sql, new FooRowMapper(), params);
        * */
        //String sql = "SELECT * FROM client WHERE name LIKE :filter OR email LIKE :filter;";
        //Map<String,Object> params = new HashMap<String, Object>();
        //params.put("filter", "'%" + filter+"%'");

        return jdbcTemplate.query(sql, new ClientMapper());
    }

    public List<Client> getAll() {
        return jdbcTemplate.query(SQL_GET_ALL, new ClientMapper());
    }

    public void remove(int id) {
        jdbcTemplate.update(SQL_REMOVE, id);
    }
}
