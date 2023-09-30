package com.example.demo.repositories;

import com.example.demo.entities.Inmobiliaria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 *
 * @author grupo 6.
 */
@Repository
public interface InmobiliariaRepository extends JpaRepository<Inmobiliaria,Integer> { }