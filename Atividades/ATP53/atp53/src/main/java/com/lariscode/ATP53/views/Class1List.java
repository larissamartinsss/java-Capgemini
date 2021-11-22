package com.lariscode.ATP53.views;

import com.lariscode.ATP53.dao.CategoriaDAO;
import com.lariscode.ATP53.model.Categoria;
import com.lariscode.ATP53.dao.ConnectionFactory;
import java.sql.*;

public class Class1List {
    public static void main(String[] args) {
        // 1º step:
        try (Connection connection = new ConnectionFactory().getConnection()) {
            CategoriaDAO dao = new CategoriaDAO(connection);

            for (Categoria c: dao.list()) {
                System.out.println(c);
            }

                System.out.println("Banco de dados conectado! ");
            } catch (SQLException e) {
                System.out.println("Não é possível conectar ao Banco de Dados. ");
            }
        }
    }



