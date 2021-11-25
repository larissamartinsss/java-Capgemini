package com.lariscode;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Sistema de Banco" );
        Categoria model = new Categoria();
        model.setNome("Testes JPA");

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("banco");
        EntityManager em = factory.createEntityManager(); // criando conexão com o banco
        // lingugagem SQL:
        em.createQuery("SELECT c.nome FROM Categoria c", Categoria.class).getResultList();
        

        

    }
}
