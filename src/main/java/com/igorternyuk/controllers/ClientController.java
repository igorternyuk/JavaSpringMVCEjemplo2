package com.igorternyuk.controllers;

import com.igorternyuk.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by zenko on 03.02.19.
 */

@Controller
@RequestMapping("/")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }
}
