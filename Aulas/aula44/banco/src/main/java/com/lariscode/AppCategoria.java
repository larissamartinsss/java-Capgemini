package com.lariscode;

import com.lariscode.Repository.CategoriaRepository;
import com.lariscode.model.Categoria;


public class AppCategoria 
{
    public static void main( String[] args )
    {
        CategoriaRepository dao = new CategoriaRepository();

        Categoria model = new Categoria();
        model.setId(1);
        model.setNome("Teste2 dao update");       

        dao.delete(1);
                
        for (Categoria categoria : dao.read()) {
            System.out.printf("%d - %s\n",categoria.getId(),categoria.getNome());
        }

    }
}
