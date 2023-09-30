/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.services;

import com.example.demo.dtos.ClienteDTO;
import com.example.demo.dtos.ListClienteDTO;
import com.example.demo.entities.Cliente;
import java.util.List;

/**
 *
 * @author grupo 6.
 */
public interface IClientService {

    ListClienteDTO findAll();

    ClienteDTO findById(Integer id);

    Cliente save(Cliente client);

    Cliente update(Integer id, Cliente client);

    void delete(Integer client);

}
