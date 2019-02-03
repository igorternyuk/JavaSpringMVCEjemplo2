package com.igorternyuk.services;

import com.igorternyuk.models.Client;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zenko on 01.02.19.
 */


public interface ClientService {
    List<Client> getAll();
}
