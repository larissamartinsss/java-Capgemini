package view;

import controller.CadPratosController;
import model.CadPratos;

import java.util.ArrayList;

public class View {
    public static void main(String[] args) {

        CadPratos cadastroPratos = new CadPratos();
        CadPratosController cadPratosController = new CadPratosController();

        CadPratos prato1 = new CadPratos();
        prato1.id = 1;

        CadPratos prato2 = new CadPratos();
        prato1.id = 2;

        System.out.println("------------------ Adicionar ------------------ \n");
        cadPratosController.create(prato1);
        listar(cadPratosController);

        System.out.println("------------------ Atualizar ------------------ \n");
        cadPratosController.update(prato2);
        listar(cadPratosController);

        System.out.println("------------------ Deletar ------------------ \n");
        cadPratosController.delete(prato2);
        listar(cadPratosController);

        System.out.println("------------------ Verificar ------------------ \n");
        cadPratosController.existe(prato1);
        cadPratosController.existe(prato2);
        listar(cadPratosController);


    }

    private static void listar(CadPratosController controller) {
        ArrayList<CadPratos> lista = controller.listar();
        for (CadPratos cadPratos : lista) {
            System.out.print(cadPratos);
        }
    }
}
