package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/produto")
public class Produto extends HttpServlet{  
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    // protocolo HTTP / HTTPS
        // request - solicitação do usuario - ex. o usuario acessando end. via chrome 
        // response - resposta do servidor ao usuário = ex. carregar a página web no chrome
    
        PrintWriter out = resp.getWriter();
        out.println("Servlet Categoria");
    }
}