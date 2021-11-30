package com.lariscode.filmes.repository;

import com.lariscode.filmes.model.Filme;

import org.springframework.data.repository.CrudRepository;

public interface FilmeRepository extends CrudRepository<Filme, Integer> {
    
}
