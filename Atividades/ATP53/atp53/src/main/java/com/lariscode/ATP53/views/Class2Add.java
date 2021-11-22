package com.lariscode.ATP53.views;

import com.lariscode.ATP53.dao.CategoriaDAO;
import com.lariscode.ATP53.dao.ConnectionFactory;
import com.lariscode.ATP53.model.Categoria;


import java.sql.*;

public class Class2Add {
    public static void main(String[] args) {
        // try with resources
        try (Connection connection = new ConnectionFactory().getConnection()) {
            CategoriaDAO dao = new CategoriaDAO(connection);
            Categoria cat1 = new Categoria("Video games");
            Categoria cat2 = new Categoria("Informática");
            dao.create(cat1);
            dao.create(cat2);
        } catch (SQLException e) {
            e.printStackTrace();

        }
    }
}
