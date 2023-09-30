/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.services;

import com.example.demo.dtos.ClienteDTO;
import com.example.demo.dtos.ListClienteDTO;
import com.example.demo.entities.Cliente;
import com.example.demo.entities.Inmobiliaria;
import com.example.demo.repositories.ClientRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author grupo 6.
 */
@Service
public class ClientService implements IClientService {

    @Autowired ClientRepository clientRepository;
    @Autowired InmobiliariaService inmobiliariaService;

    private ModelMapper modelMapper = new ModelMapper();

    public static final int ANUAL_RENTABILITY = 33;

    /**
     * Metodo para listar todos los clientes.
     * Verifica que el cliente no sea el dueño de la inmobiliaria,
     * y si lo es, guarda su nombre para mostrarlo en el mensaje.
     * Tambien muestra que porcentaje de rentabilidad anual gana con la inmobiliaria.
     * Si no hay clientes, retorna null.
     *
     * @return
     */
    @Override
    public ListClienteDTO findAll() {
        var clients = clientRepository.findAll();
        List<ClienteDTO> clientsDTO = new ArrayList<>();
        String ownerName = "";

        for (Cliente client : clients) {
            ClienteDTO clientDTO = modelMapper.map(client, ClienteDTO.class);

            // Si el cliente es dueño de la inmobiliaria, se guarda el nombre del cliente
            if ("OWNER_INMOBILIARIA".equals(client.getTipoCliente())) {
                ownerName = client.getNombre() + " " + client.getApellido();
            }

            clientsDTO.add(clientDTO);
        }

        ListClienteDTO listClienteDTO = new ListClienteDTO();
        listClienteDTO.setClientes(clientsDTO);
        listClienteDTO.setMessage("El dueño de la inmobiliaria es " + ownerName + ". Gana un " + ANUAL_RENTABILITY + "% de rentabilidad anual" +
                "y a continuacion se podra ver la lista de inquilinos y propietarios.");


        return listClienteDTO;
    }




    /**
     * Metodo para buscar un cliente por id.
     * @param id Id del cliente a buscar.
     * @return Cliente encontrado.
     */
    @Override
    public ClienteDTO findById(Integer id) {
        var clientOptional = clientRepository.findById(id);

        if (clientOptional.isPresent()) {
            var client = clientOptional.get();
            var clientDTO = new ClienteDTO();

            clientDTO.setId(client.getId());
            clientDTO.setTipoCliente(client.getTipoCliente());
            clientDTO.setDireccion(client.getDireccion());
            clientDTO.setDni(client.getDni());
            clientDTO.setMail(client.getMail());
            clientDTO.setNombre(client.getNombre());
            clientDTO.setApellido(client.getApellido());
            clientDTO.setTelefono(client.getTelefono());

            return clientDTO;
        } else {
            return null;
        }
    }


    /**
     * Metodo que guarda un cliente en la base de datos.
     * Y lo asocia a la inmobiliaria.
     * @param client Cliente a guardar.
     * @return Cliente guardado.
     */
    @Override
    public Cliente save(Cliente client) {
        Optional<Inmobiliaria> inmobiliariaOptional = inmobiliariaService.findById(1);

        if (inmobiliariaOptional.isPresent()) {
            Inmobiliaria inmobiliaria = inmobiliariaOptional.get();
            client.setInmobiliaria(inmobiliaria);
            return clientRepository.save(client);
        } else {
            return null;
        }
    }



    /**
     * Metodo para actualizar un cliente.
     *
     * @param id
     * @param client Cliente a actualizar.
     * @return Cliente actualizado.
     */
    @Override
    public Cliente update(Integer id, Cliente client) {
        var clientExist = clientRepository.findById(id);

        while (clientExist.isPresent()) {
            clientExist.get().setTipoCliente(client.getTipoCliente());
            clientExist.get().setDireccion(client.getDireccion());
            clientExist.get().setDni(client.getDni());
            clientExist.get().setMail(client.getMail());
            clientExist.get().setNombre(client.getNombre());
            clientExist.get().setApellido(client.getApellido());
            clientExist.get().setTelefono(client.getTelefono());
            
            return clientRepository.save(client);
        }
        
        return null;
    }


    /**
     * Metodo para eliminar un cliente.
     * @param id id del cliente a eliminar.
     * @return Mensaje de confirmacion.
     */
    public void delete(Integer id) {
        clientRepository.deleteById(id);
    }
}
