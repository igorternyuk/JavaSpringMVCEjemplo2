package com.igorternyuk.services;

import com.igorternyuk.dao.ClientDAO;
import com.igorternyuk.models.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zenko on 03.02.19.
 */

@Service
public class ClientServiceImpl implements ClientService {
    @Autowired
    private ClientDAO clientDAO;
    public List<Client> getAll() {
        return clientDAO.getAll();
    }
}
