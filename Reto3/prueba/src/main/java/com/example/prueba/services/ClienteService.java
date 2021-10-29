/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.prueba.services;

import com.example.prueba.models.ClienteModel;
import com.example.prueba.repositories.ClienteRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ASUS RYZEN
 */
@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public List<ClienteModel> getAllClientes() {
        return (List<ClienteModel>) clienteRepository.getAll();
    }
    
    public ClienteModel save(ClienteModel clienteModel) {
        
        
        if(clienteModel.getId() == null)
            return clienteRepository.save(clienteModel);    
         
        return clienteModel;
        
    }
}
