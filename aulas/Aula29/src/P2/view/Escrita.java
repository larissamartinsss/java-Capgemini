package P2.view;

import java.io.*;

public class Escrita {
    public static void main(String[] args) {
        //Fluxo de Saída:

        try {
            InputStream fis = new FileInputStream("src/P2/dados/molhos.txt");
            Reader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);

            OutputStream fos = new FileOutputStream("src/P2/dados/molhos2.txt");
            Writer osw = new OutputStreamWriter(fos);
            BufferedWriter bw = new BufferedWriter(osw);


            // Ler até o final do arquivo:
            while (br.ready()){
                String linha = br.readLine();
                bw.write(linha+"\n");
            }
            //fechar o fluxo de leitura:
            bw.close();
            br.close();



        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado.");
        } catch (IOException e) {
            System.out.println("Não foi possivel escrever no arquivo");
        }
    }
}
