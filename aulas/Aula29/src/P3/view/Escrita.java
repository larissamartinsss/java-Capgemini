package P3.view;

import java.io.*;

public class Escrita {
    public static void main(String[] args) {
        //Fluxo de Saída:
        PrintStream ps = null;
        try {
//            FileOutputStream fos = new FileOutputStream("src/P1/dados/molhos.txt");
//            OutputStreamWriter osw = new OutputStreamWriter(fos);
//            BufferedWriter bw = new BufferedWriter(osw); ISSO TUDO PODE SER SUBSTITUIDO POR:
            ps = new PrintStream("src/P3/dados/molho.txt");
            // bw.write("Sugo\n"); substituido por:
            ps.println("Sugo\n");
            ps.println("Branco\n");
            //fechar o fluxo:

        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado.");
        } finally { // Serve pra fechar o programa independente de ocorrer erros ou não.
            ps.close();
        }
    }
}
