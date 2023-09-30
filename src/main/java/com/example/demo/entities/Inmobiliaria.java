/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.List;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author grupo 6.
 */
@Getter
@Setter
@Entity
@Table(name = "inmobiliaria")
public class Inmobiliaria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String razonSocial;

    private String matricula;

    private Integer cuit;

    private String mail;

    private String direccion;

    private String telefono;

    @JsonBackReference
    @OneToMany(mappedBy = "inmobiliaria")
    private List<Cliente> clientes;

}