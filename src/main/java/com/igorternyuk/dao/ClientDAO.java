package com.igorternyuk.dao;

import com.igorternyuk.models.Client;

import java.util.List;

/**
 * Created by zenko on 01.02.19.
 */
public interface ClientDAO {
    void addNew(Client client);
    void update(Client client);
    Client getById(int id);
    List<Client> findByName(String filter);
    List<Client> getAll();
    void remove(int id);

}
