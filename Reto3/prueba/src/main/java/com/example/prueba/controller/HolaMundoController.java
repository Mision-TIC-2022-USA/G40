/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.prueba.controller;

import com.example.prueba.models.ClienteModel;
import com.example.prueba.services.ClienteService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ASUS RYZEN
 */
@RestController
@RequestMapping("/api/Client")
public class HolaMundoController {
    
    @Autowired
    private ClienteService clienteService;
    
    @GetMapping("/all")
    public List<ClienteModel> getAll()
    {
        return clienteService.getAllClientes();
    }
    
    @PostMapping("/save")
    public ResponseEntity<ClienteModel> save(@RequestBody ClienteModel clienteModel)
    {
        clienteService.save(clienteModel);
        ResponseEntity entity = new ResponseEntity(clienteModel,HttpStatus.CREATED);
        return entity;
    }
}
