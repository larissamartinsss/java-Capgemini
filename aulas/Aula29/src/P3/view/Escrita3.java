package P3.view;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;


public class Escrita3 {
    public static void main(String[] args) {
        //Fluxo de Saída:
        FileWriter fw = null;
        try {
            // append: Serve para incluir mais dados no arquivo, sem perder nada.
            fw = new FileWriter("src/P3/dados/molho.txt", true);
            // bw.write("Sugo\n"); substituido por:
            fw.write("Sugo\n");
            fw.write("Branco\n");
            fw.write("Bolonhesa\n");
            fw.write("Madeira\n");
            fw.write("Tucupi\n");
            //fechar o fluxo:
            fw.close();
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado.");
        } catch (IOException e) {
            System.out.println("Não foi possivel escrever no arquivo");
        }
    }
}
