package com.lariscode;
import java.util.List;

import com.lariscode.dao.CategoriaDao;
import com.lariscode.model.Categoria;
public class App 
{    public static void main( String[] args )
    {
        // Parei aqui: https://youtu.be/qHhFd7F_MA8
        CategoriaDao dao = new CategoriaDao();
        Categoria model = new Categoria();
        model.setId(4);
        model.setNome("Testes JPA com dao - update");
        
        dao.delete(4);


        
        for (Categoria categoria : dao.read()) {
            System.out.printf("%d - %s\n", categoria.getId(), categoria.getNome());     
        }
     
    }
}
