package com.lariscode.Clientes.repository;
import com.lariscode.Clientes.model.CadClientes;

import org.springframework.data.repository.CrudRepository;

public interface CadClientesRepository extends CrudRepository<CadClientes, Integer> {
    
}
