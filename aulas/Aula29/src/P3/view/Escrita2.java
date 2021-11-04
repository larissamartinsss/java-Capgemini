package P3.view;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Escrita2 {
    public static void main(String[] args) {
        //Fluxo de Saída:
        PrintWriter ps = null;
        try {
            ps = new PrintWriter("src/P3/dados/molho.txt");
            // bw.write("Sugo\n"); substituido por:
            ps.println("Sugo\n");
            ps.println("Branco\n");
            ps.println("Bolonhesa\n");
            ps.println("Madeira\n");
            //fechar o fluxo:

        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado.");
        } finally { // Serve pra fechar o programa independente de ocorrer erros ou não.
            ps.close();
        }
    }
}
