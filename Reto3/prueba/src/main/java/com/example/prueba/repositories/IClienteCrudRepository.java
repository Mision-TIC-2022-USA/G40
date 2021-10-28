/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.prueba.repositories;

import com.example.prueba.models.ClienteModel;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author ASUS RYZEN
 */
public interface IClienteCrudRepository extends CrudRepository<ClienteModel, Integer>{
    
}
