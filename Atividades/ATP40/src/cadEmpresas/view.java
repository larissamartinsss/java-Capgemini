package cadEmpresas;

import java.io.FileWriter;
import java.io.IOException;

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
        } catch (IOException e) {
            System.out.println("Não foi possível abrir o arquivo. ");
        }

    }
}
