package P3.view;
import java.io.*;
import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        // pode ser usado assim:
//        File f = new File("src/P3/dados/molho.txt");
//        Scanner sc = new Scanner(f);
        //Ou assim:

        try {
            Scanner sc = new Scanner(new File("src/P3/dados/molho.txt"));
            while (sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado.");
        }
    }
}
