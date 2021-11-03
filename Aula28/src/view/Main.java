package view;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {

        try {
            FileInputStream fis = new FileInputStream("pratos.txt");
            System.out.println("Arquivo aberto com sucesso!");
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado");
        }

        }
}
