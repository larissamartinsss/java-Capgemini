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
        String nome = req.getParameter("nome");
        String parametroValor = req.getParameter("valor"); 
        String parametroId = req.getParameter("id");       
        PrintWriter out = resp.getWriter();

        if(parametroValor != null || parametroId != null){
            float valor = Float.parseFloat(parametroValor);
            int id_categoria = Integer.parseInt(parametroId);

        out.printf("Modulo produto -- nome: %s \nvalor: %f \nID: %d", nome, valor, id_categoria);
        }else
        
        out.printf("Modulo produto --nome: %s:", nome);
    
        
        }
}