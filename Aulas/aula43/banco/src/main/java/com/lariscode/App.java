package com.lariscode;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.lariscode.model.Categoria;
public class App 
{    public static void main( String[] args )
    {
        System.out.println( "Sistema de Banco" );
        Categoria model = new Categoria();
        model.setNome("Testes JPA");

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("banco");
        EntityManager em = factory.createEntityManager(); // criando conexão com o banco
        
        em.getTransaction().begin();
        em.persist(model);
        em.getTransaction().commit();

        // lingugagem SQL:
        List<Categoria> lista = em.createQuery("SELECT c FROM Categoria c", Categoria.class).getResultList();
        
        for (Categoria categoria : lista) {
            System.out.printf("%d - %s\n", categoria.getId(), categoria.getNome());     
        }
     
    }
}
