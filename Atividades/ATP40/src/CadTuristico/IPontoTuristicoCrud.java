package CadTuristico;

import java.util.ArrayList;

public interface IPontoTuristicoCrud {
    public String save(PontosTuristicos model);
    public ArrayList<PontosTuristicos> read();

}
