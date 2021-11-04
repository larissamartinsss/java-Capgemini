package controller;

import model.Pessoa;

public class PessoaController extends BaseController<Pessoa> {
    public PessoaController(){
        //Arquivo unico
        super("src/dados/pessoa.csv");
    }
}
