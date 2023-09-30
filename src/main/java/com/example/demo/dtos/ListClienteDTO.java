package com.example.demo.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

/**
 *
 * @author grupo 6.
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ListClienteDTO {
    String message;
    List<ClienteDTO> clientes;
}
