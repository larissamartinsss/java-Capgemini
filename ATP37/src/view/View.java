package view;

import controller.CadPratosController;
import model.CadPratos;

public class View {
    public static void main(String[] args) {

        CadPratos cadastroPratos = new CadPratos();
        CadPratosController cadPratosController = new CadPratosController();

        CadPratos prato1 = new CadPratos();

        prato1.id = 1;
    }
}
