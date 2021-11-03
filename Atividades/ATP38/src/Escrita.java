import java.io.*;

public class Escrita {
    public static void main(String[] args) throws FileNotFoundException {
        // Fluxo de saída:

        try {
            FileOutputStream fos = new FileOutputStream("src/dados/saida.txt");
            OutputStreamWriter osw = new OutputStreamWriter(fos);
            BufferedWriter bw = new BufferedWriter(osw);

            bw.write("Olá mundo\n");
            bw.write("Hello World\n");
            bw.write("Bonjour le monde\n");
            bw.close();
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado. ");
        }
        catch (IOException e) {
            System.out.println("Não foi possivel escrever no arquivo.");
        }
    }
}
