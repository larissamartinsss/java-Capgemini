
import java.io.*;

public class Leitura {
    public static void main(String[] args) {

            try {
                //Entrando em bites:
                FileInputStream fis = new FileInputStream("src/dados/entrada.txt");
                // Convertendo para Char:
                InputStreamReader isr = new InputStreamReader(fis);
                // Acumulando Chars para leitura
                BufferedReader br = new BufferedReader(isr);

               while(br.ready()){
                   System.out.println("\n"+br.readLine());
               }

            } catch (FileNotFoundException e) {
                System.out.println("Arquivo não encontrado");
            } catch (IOException e) {
                System.out.println("Não é possivel ler o arquivo.");
            }


    }
}
