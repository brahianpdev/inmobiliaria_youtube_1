package com.example.demo.services;

import com.example.demo.entities.Cliente;
import com.example.demo.entities.Inmobiliaria;
import com.example.demo.repositories.InmobiliariaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 *
 * @author grupo 6.
 */
@Service
public class InmobiliariaService implements IInmobiliariaService {

    @Autowired
    InmobiliariaRepository inmobiliariaRepository;


    /**
     * Metodo para buscar una inmobiliaria por id.
     * Como solo tenemos una, si el id es distinto de 1, retorna null.
     * @param id id de la inmobiliaria.
     * @return inmobiliaria.
     */
    @Override
    public Optional<Inmobiliaria> findById(Integer id) {
        var inmobiliaria = inmobiliariaRepository.findById(id);

        if (inmobiliaria.isEmpty()) {
            return null;
        }

        return inmobiliaria;
    }

}
