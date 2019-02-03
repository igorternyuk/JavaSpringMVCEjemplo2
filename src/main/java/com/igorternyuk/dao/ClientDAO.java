package com.igorternyuk.dao;

import com.igorternyuk.models.Client;

import java.util.List;

/**
 * Created by zenko on 01.02.19.
 */
public interface ClientDAO {

    List<Client> getAll();
}
