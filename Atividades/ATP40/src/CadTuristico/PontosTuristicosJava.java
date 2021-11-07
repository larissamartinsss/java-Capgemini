package CadTuristico;

import java.util.ArrayList;

public class PontosTuristicosJava implements IPontoTuristicoCrud {
    private ArrayList<PontosTuristicos> lista = new  ArrayList<PontosTuristicos>();

    @Override
    public String save(PontosTuristicos model) {
        this.lista.add(model);
        return String.format("Pontos turisticos: %s salvo com sucesso", model.nome);
    }

    @Override
    public ArrayList<PontosTuristicos> read() {
        return this.lista;
    }
}
