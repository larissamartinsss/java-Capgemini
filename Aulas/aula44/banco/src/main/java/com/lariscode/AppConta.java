package com.lariscode;

import com.lariscode.Repository.ContaCorrenteRepository;
import com.lariscode.model.ContaCorrente;

public class AppConta 
{
    public static void main( String[] args )
    {
        ContaCorrenteRepository dao = new ContaCorrenteRepository();
        ContaCorrente model = new ContaCorrente();
        model.setNome("Conta do Joaozin");
        model.setDescricao("Conta zero tarifa");


        dao.create(model);
    }
}