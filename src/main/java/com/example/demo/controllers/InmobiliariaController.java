package com.example.demo.controllers;

import com.example.demo.entities.Inmobiliaria;
import com.example.demo.services.IInmobiliariaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

/**
 *
 * @author grupo 6.
 */
@RestController
@RequestMapping("/inmobiliaria")
public class InmobiliariaController {

    @Autowired
    IInmobiliariaService iInmobiliariaService;


    @GetMapping("/{id}")
    public Optional<Inmobiliaria> findById(@PathVariable("id") Integer id){
        return iInmobiliariaService.findById(id);
    }

}
