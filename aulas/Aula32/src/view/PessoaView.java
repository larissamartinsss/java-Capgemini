package view;

import controller.PessoaController;
import model.Pessoa;

public class PessoaView {
    public static void main(String[] args) {
        PessoaController pc = new PessoaController();
        Pessoa p1 = new Pessoa();

        p1.id = 1;
        p1.nome = "Larissa";
        p1.sobrenome = "Souza";

        pc.create(p1);

        for (Pessoa p: pc.read()) {
            System.out.println(p);
        }

    }
}
