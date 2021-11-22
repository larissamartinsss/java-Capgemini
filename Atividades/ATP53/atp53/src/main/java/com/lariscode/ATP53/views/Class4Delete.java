package com.lariscode.atp53.views;

import com.lariscode.atp53.dao.CategoriaDAO;
import com.lariscode.atp53.dao.ConnectionFactory;

import java.sql.Connection;


public class Class4Delete {
    public static void main(String[] args) {
        try( Connection connection = new ConnectionFactory().getConnection()){

            CategoriaDAO dao = new CategoriaDAO(connection);
            dao.delete(2);

        } catch (Exception e) {
            System.out.println("Não é possível conectar ao Banco de Dados. ");
        }
    }
}
