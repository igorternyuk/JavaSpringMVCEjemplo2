package com.igorternyuk.services;

import com.igorternyuk.models.Client;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zenko on 01.02.19.
 */


public interface ClientService {
    void addNew(Client client);
    void update(Client client);
    Client getById(int id);
    List<Client> findByName(String filter);
    List<Client> getAll();
    void remove(int id);
}
