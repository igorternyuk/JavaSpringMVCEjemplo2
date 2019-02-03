package com.igorternyuk.controllers;

import com.igorternyuk.models.Client;
import com.igorternyuk.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/clients")
    public String getAllClients(Model model){
        model.addAttribute("clients", clientService.getAll());
        return "clientList";
    }

    @GetMapping("/client/{id}")
    public String getById(@PathVariable("id") int id, Model model){
        model.addAttribute("client", clientService.getById(id));
        return "clientInfo";
    }

    @GetMapping("/addClient")
    public String addClient(){
        return "addClient";
    }

    @PostMapping("/saveClient")
    public String saveClient(@ModelAttribute("client") Client client){
        clientService.addNew(client);
        return "redirect:/clients";
    }

    @GetMapping("/removeClient/{id}")
    public String removeClient(@PathVariable("id") int id){
        clientService.remove(id);
        return "redirect:/clients";
    }

    @GetMapping("/editClient/{id}")
    public String editClient(@PathVariable("id") int id, Model model){
        model.addAttribute("client", clientService.getById(id));
        return "updateClient";
    }

    @PostMapping("/updateClient")
    public String updateClient(@ModelAttribute("client") Client client){
        clientService.update(client);
        return "redirect:/clients";
    }

    @GetMapping("/find")
    public String findClient(@RequestParam("searchFilter") String filter, Model model){
        model.addAttribute("clients", clientService.findByName(filter));
        return "searchResult";
    }
}
