package com.lariscode.vendas.servlets;
import java.io.IOException;
import java.io.PrintWriter;

import com.lariscode.vendas.models.Produto;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/produto")
public class ProdutoServlet extends HttpServlet{
    Produto prod1 = new Produto();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        prod1.setNome(req.getParameter("nome"));
        String parametroValor = req.getParameter("valor"); 
        String parametroId = req.getParameter("id");       
        PrintWriter out = resp.getWriter();

        if(parametroValor != null && parametroId != null){
            prod1.setValor(Float.parseFloat(parametroValor));
            prod1.setId_categoria(Integer.parseInt(parametroId));

        out.printf("Modulo produto -- nome: %s \nvalor: %f \nID: %d", prod1.getNome(), prod1.getId_categoria() ,prod1.getId_categoria());
        }else{
        
         out.printf("Modulo produto --nome: %s:", prod1.getNome());
        
    }

        
        }
}