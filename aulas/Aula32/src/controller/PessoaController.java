package controller;

import dao.PessoaDao;
import model.Pessoa;

public class PessoaController extends BaseController<Pessoa>{
    public PessoaController() {
        super(new PessoaDao());
    }
}
