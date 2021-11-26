package com.lariscode;

import com.lariscode.dao.CategoriaDao;
import com.lariscode.model.Categoria;


public class AppCategoria 
{
    public static void main( String[] args )
    {
        CategoriaDao dao = new CategoriaDao();

        Categoria model = new Categoria();
        model.setId(4);
        model.setNome("Teste2 dao update");       

        dao.delete(4);
                
        for (Categoria categoria : dao.read()) {
            System.out.printf("%d - %s\n",categoria.getId(),categoria.getNome());
        }

    }
}
