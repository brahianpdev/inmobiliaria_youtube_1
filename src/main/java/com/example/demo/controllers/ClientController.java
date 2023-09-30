/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.controllers;

import com.example.demo.dtos.ClienteDTO;
import com.example.demo.dtos.ListClienteDTO;
import com.example.demo.entities.Cliente;
import com.example.demo.services.IClientService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @author grupo 6.
 */
@RestController
@RequestMapping("/clients")
public class ClientController {
    
    @Autowired IClientService iClientService;
    
    @GetMapping()
    public ListClienteDTO findClients(){
        return iClientService.findAll();   
    }

    @GetMapping("/{id}")
    public ClienteDTO findClientById(@PathVariable Integer id){
        return iClientService.findById(id);
    }

    @PostMapping("/register")
    public Cliente registerClient(@RequestBody Cliente client){
        return iClientService.save(client);
    }

    @PutMapping("/update/{id}")
    public Cliente updateClient(
            @PathVariable Integer id,
            @RequestBody Cliente client){
        return iClientService.update(id, client);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteClient(@PathVariable Integer id) {
        iClientService.delete(id);

        return ResponseEntity.ok("Client deleted");
    }
}
