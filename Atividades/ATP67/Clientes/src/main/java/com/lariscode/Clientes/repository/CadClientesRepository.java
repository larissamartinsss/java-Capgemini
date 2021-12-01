package com.lariscode.Clientes.repository;
import java.util.List;

import com.lariscode.Clientes.model.CadClientes;

import org.springframework.data.domain.Sort;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CadClientesRepository extends PagingAndSortingRepository<CadClientes, Integer> {
    @Override
    default Iterable<CadClientes> findAll() {
        return findAll(Sort.by(Sort.Direction.ASC, "id"));
    }

    List<CadClientes> findByNome(String nome);
    
}
