package com.lariscode.dao;

import com.lariscode.model.Categoria;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CategoriaDao {
    private EntityManager entityManager;
  
    public CategoriaDao(){
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("banco");
        this.entityManager = factory.createEntityManager(); // criando conexão com o banco
        
    }    

    public int create(Categoria model){

        this.entityManager.getTransaction().begin();
        this.entityManager.persist(model);
        this.entityManager.getTransaction().commit();
        return model.getId();
    }

    public List<Categoria> read(){
      // lingugagem SQL:
      return this.entityManager.createQuery("SELECT c FROM Categoria c", Categoria.class).getResultList();
     
    }

    public void update(Categoria model){
        this.entityManager.getTransaction().begin();
        this.entityManager.merge(model);
        this.entityManager.getTransaction().commit(); 
    }


    public void delete(int id) {
        Categoria model = this.entityManager.find(Categoria.class, id);
        this.entityManager.getTransaction().begin();
        this.entityManager.remove(model);
        this.entityManager.getTransaction().commit(); 

    }
    
}
