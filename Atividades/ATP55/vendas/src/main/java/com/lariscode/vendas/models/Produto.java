package com.lariscode.vendas.models;

public class Produto {
    private String nome;
    private float valor;
    private int id_categoria;
    

 public String getNome() {
     return nome;
 }
 public int getId_categoria() {
    return id_categoria;
}
public void setId_categoria(int id_categoria) {
    this.id_categoria = id_categoria;
}
public float getValor() {
    return valor;
}
public void setValor(float valor) {
    this.valor = valor;
}
public void setNome(String nome) {
     this.nome = nome;
 }

 } 

