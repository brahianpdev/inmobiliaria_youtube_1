package com.example.demo.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author grupo 6.
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ClienteDTO {
    private Integer id;
    private String tipoCliente;
    private String direccion;
    private Integer dni;
    private String mail;
    private String nombre;
    private String apellido;
    private Integer telefono;
}