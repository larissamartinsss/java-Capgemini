package view;

import java.io.*;

public class Escrita {
    public static void main(String[] args) {
        //Fluxo de Saída:

        try {
            FileOutputStream fos = new FileOutputStream("src/dados/molhos.txt");
            OutputStreamWriter osw = new OutputStreamWriter(fos);
            BufferedWriter bw = new BufferedWriter(osw);

            bw.write("Sugo\n");
            bw.write("Branco\n");

            //fechar o fluxo:
            bw.close();

        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado.");
        } catch (IOException e) {
            System.out.println("Não foi possivel escrever no arquivo");
        }
    }
}
