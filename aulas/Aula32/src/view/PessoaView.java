package view;

import controller.PessoaController;
import model.Pessoa;

public class PessoaView {
    public static void main(String[] args) {
        PessoaController pc = new PessoaController();
        Pessoa p1 = new Pessoa();
        p1.id = 5;
        p1.nome = "Mateus";
        p1.sobrenome = "Souza";

        pc.create(p1);

        for (Object p : pc.read()) {
            System.out.println(p);
        }
        pc.delete(p1);
        System.err.println("Deletando");
        for (Object p : pc.read()) {
            System.out.println(p);
        }


        p1.id = 1;
        p1.nome = "Larissa";
        p1.sobrenome = "Souza";
        pc.update(p1);

        System.err.println("Alterado");
        for (Object p : pc.read()) {
            System.out.println(p);
        }
    }
}

