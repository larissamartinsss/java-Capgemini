package com.lariscode.ATP53.views;


import com.lariscode.ATP53.dao.CategoriaDAO;
import com.lariscode.ATP53.model.Categoria;
import com.lariscode.ATP53.dao.ConnectionFactory;

import java.sql.Connection;


public class Class3Update {
    public static void main(String[] args) {
        try ( Connection connection = new ConnectionFactory().getConnection()){
            CategoriaDAO dao = new CategoriaDAO(connection);
            Categoria model = new Categoria(3, "Alteração DAO");
            System.out.printf("\nO nº de linhas alteradas é de: %d", dao.update(model));

        } catch (Exception e) {
            System.out.println("Não é possível conectar ao Banco de Dados. ");
        }
    }
}

