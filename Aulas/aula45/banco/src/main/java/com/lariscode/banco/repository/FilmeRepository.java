package com.lariscode.banco.repository;

import com.lariscode.banco.model.Filme;

import org.springframework.data.repository.CrudRepository;

public interface FilmeRepository extends CrudRepository<Filme, Integer> {
    
}
