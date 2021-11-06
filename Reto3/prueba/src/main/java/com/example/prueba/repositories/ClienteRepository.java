/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.prueba.repositories;

import com.example.prueba.models.ClienteModel;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ASUS RYZEN
 */
@Repository
public class ClienteRepository {

    @Autowired
    private IClienteCrudRepository clienteCrudRepository;

    public List<ClienteModel> getAll() {
        return (List<ClienteModel>) clienteCrudRepository.findAll();
    }
    
    public ClienteModel save(ClienteModel clienteModel ) {
        return clienteCrudRepository.save(clienteModel);
    }
    
    public Optional<ClienteModel> getClientById(int id)
    {
      return clienteCrudRepository.findById(id);
    }
}
