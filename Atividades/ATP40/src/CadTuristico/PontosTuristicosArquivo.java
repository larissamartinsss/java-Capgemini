package CadTuristico;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class PontosTuristicosArquivo implements IPontoTuristicoCrud {
private String filename = "src/cadTurismo/dados/pontosturisticos.csv";
    @Override
    public String save(PontosTuristicos model) {
        String msgretorno = null;

        FileWriter fw = null;
        try {
            fw = new FileWriter(filename);
            fw.write(model.toString() + "\n");
            fw.close();
            msgretorno = String.format("s%,s%,s%", model.nome);
        } 
        catch (IOException e) {
            e.printStackTrace();
        } return msgretorno;
    }

    @Override
    public ArrayList<PontosTuristicos> read() {
        return null;
    }
}
