package com.lariscode;

import com.lariscode.dao.ContaCorrenteDao;
import com.lariscode.model.ContaCorrente;

public class AppConta 
{
    public static void main( String[] args )
    {
        ContaCorrenteDao dao = new ContaCorrenteDao();
        ContaCorrente model = new ContaCorrente();
        model.setNome("Conta do Joaozin");
        model.setDescricao("Conta zero tarifa");


        dao.create(model);
    }
}