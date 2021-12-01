package com.lariscode.Clientes.repository;
import com.lariscode.Clientes.model.CadClientes;

import org.springframework.data.domain.Sort;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CadClientesRepository extends PagingAndSortingRepository<CadClientes, Integer> {
    @Override
    default Iterable<CadClientes> findAll() {
        return findAll(Sort.by(Sort.Direction.ASC, "id"));
    }
    
}
