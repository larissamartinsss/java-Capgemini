package P2.view;

import java.io.*;

public class Leitura {
    public static void main(String[] args) {
        try{
            FileInputStream fis = new FileInputStream("src/P2/dados/pratos.txt");

            InputStreamReader isr = new InputStreamReader(fis);

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
