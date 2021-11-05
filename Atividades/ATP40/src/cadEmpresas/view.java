package cadEmpresas;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class view {
    private static String fileName = "src/dados/empresa.csv";
    public static void main(String[] args) {
        Empresa empresa = new Empresa();
        empresa.nome = "lariTech";
        empresa.cnpj = "XX. XXX. XXX/0001-XX";
        empresa.ramo = "Desenv. de Softwares";

        //DAO - Object -> String
        String empresaString = String.format("%s;%s;%s\n", empresa.nome, empresa.cnpj, empresa.ramo);
                            // String formart é mais performatico.


        try {
            FileWriter fw = new FileWriter(fileName, true);
           fw.write(empresaString);
            fw.close();
        } catch (IOException e) {
            System.out.println("Não foi possível abrir o arquivo. ");
        }
        // leitura
        try {
           Scanner sc = new Scanner(new File(fileName));
            while (sc.hasNextLine()) {
                String linha = sc.nextLine();
                String[] dadosEmpresa = linha.split(";");
                System.out.println(sc.nextLine());
                // DAO - STRING --> OBJECT
                Empresa e = new Empresa();
                e.nome =dadosEmpresa[0];
                e.cnpj =dadosEmpresa[1];
                e.ramo =dadosEmpresa[2];
                // PRINT DO OBJECT FORMATADO:
                System.out.printf("\"%s;%s;%s\\n\"", e.nome, e.cnpj, e.ramo);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
