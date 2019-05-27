package com.example.listagens;

public class Comida {

    private String nome;
    private String ingredientes;
    private double valor;

    public Comida(String nome, String ingredientes, double valor) {
        this.nome = nome;
        this.ingredientes = ingredientes;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
