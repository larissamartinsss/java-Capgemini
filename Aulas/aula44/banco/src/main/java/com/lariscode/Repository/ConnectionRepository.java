package com.lariscode.Repository;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
public class ConnectionRepository {
    private EntityManager entityManager;
    
    public ConnectionRepository() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("banco");
        this.entityManager = factory.createEntityManager();
    }

    public EntityManager getConnection(){
        return entityManager;
    }
}
    
