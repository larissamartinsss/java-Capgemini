package com.lariscode.vendas.models;

public class Categoria {
   private String nome;
   private String descricao;
   private int id;
   
public String getDescricao() {
    return descricao;
}
public int getId() {
    return id;
}
public void setId(int id) {
    this.id = id;
}
public String getNome() {
    return nome;
}
public void setNome(String nome) {
    this.nome = nome;
}
public void setDescricao(String descricao) {
    this.descricao = descricao;
} 
}
