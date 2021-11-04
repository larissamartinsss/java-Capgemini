package sistemasArquivos;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("src/sistemasArquivos/dados/entrada.txt"));
            while (sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado.");
        }
    }
}
