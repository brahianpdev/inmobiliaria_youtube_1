package com.example.demo.services;

import com.example.demo.entities.Cliente;
import com.example.demo.entities.Inmobiliaria;

import java.util.List;
import java.util.Optional;

/**
 *
 * @author grupo 6.
 */
public interface IInmobiliariaService {

    Optional<Inmobiliaria> findById(Integer id);
}
