package sistemasDados;

import java.io.*;

public class LeituraeEscrita {
    public static void main(String[] args) {
            //Fluxo de Saída:
            try {
                //lendo do teclado/ Terminal:
                System.out.println("Escreva algo: \n");
                InputStream fis = System.in;
                Reader isr = new InputStreamReader(fis);
                BufferedReader br = new BufferedReader(isr);

                // Escrevendo do terminal para o arquivo:
                OutputStream fos = new FileOutputStream("src/sistemasDados/dados/teclado.txt");
                Writer osw = new OutputStreamWriter(fos);
                BufferedWriter bw = new BufferedWriter(osw);

                // Ler até o final do arquivo:
                String linha = br.readLine();
                while (linha != null && !linha.equals("mundo")){
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

