package view;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        try {

            // Abrir entrada em bites:
            FileInputStream fis = new FileInputStream("src/dados/pratos.txt");
//          System.out.println(fis.read());

            //Ler convertendo para Caracter, lendo Char por Char:
            InputStreamReader isr = new InputStreamReader(fis);
//            char[] dados = new char[5];
//            isr.read(dados, 0, 5);
//            System.out.println(dados);

            // Pega a entrada e vai acumulando os Char até determinado ponto.
            BufferedReader br = new BufferedReader(isr);
            // Ler até o final do arquivo:
            while (br.ready()){
                String linha = br.readLine();
                System.out.println(linha);
            }
            br.close();
            System.out.println("Arquivo aberto com sucesso!");

        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado");
        }catch (IOException e){
            System.out.println("Não foi possivel ler o arquivo.");
        }

        }
}
