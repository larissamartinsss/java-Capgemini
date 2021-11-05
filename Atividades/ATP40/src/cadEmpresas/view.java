package cadEmpresas;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class view {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();
        empresa.nome = "lariTech";
        empresa.cnpj = "XX. XXX. XXX/0001-XX";
        empresa.ramo = "Desenv. de Softwares";

        try {
            FileWriter fw = new FileWriter("src/dados/empresa.csv");
            String empresaString = String.format("%s;%s;%s", empresa.nome, empresa.cnpj, empresa.ramo);
            fw.write(empresaString);
            fw.close();
        } catch (IOException e) {
            System.out.println("Não foi possível abrir o arquivo. ");
        }

        try {
           Scanner sc = new Scanner(new File("src/dados/empresa.csv"));
            while (sc.hasNextLine()) {
                String linha = sc.nextLine();
                String[] empresaString = linha.split(";");
                System.out.println(sc.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
