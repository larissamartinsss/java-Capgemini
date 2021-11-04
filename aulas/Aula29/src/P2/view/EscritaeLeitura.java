package P2.view;

import java.io.*;

public class EscritaeLeitura {
    public static void main(String[] args) {
        //Fluxo de Saída:

        try {
            InputStream fis = System.in;
            Reader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);

            OutputStream fos = new FileOutputStream("src/P2/dados/teclado.txt");
            Writer osw = new OutputStreamWriter(fos);
            BufferedWriter bw = new BufferedWriter(osw);


            // Ler até o final do arquivo:
            String linha = br.readLine();
            while (linha != null && !linha.equals("q")){
                linha = br.readLine();
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
