package com.example.listagens;

import java.util.ArrayList;
import java.util.List;

public class Comida {

    private String nome;
    private String ingredientes;
    private double valor;

    public Comida(String nome, String ingredientes, double valor) {
        this.nome = nome;
        this.ingredientes = ingredientes;
        this.valor = valor;
    }

    public static List<Comida> getComidas(){
        List<Comida> comidas =new ArrayList<>();
        comidas.add(new Comida("Coxinha Frango","Trigo+Frango+Sal", 3));
        comidas.add(new Comida("Coxinha Queijo","Trigo+Frango+Sal", 3));
        comidas.add(new Comida("Coxinha ","Trigo+Frango+Sal", 3));
        comidas.add(new Comida("Coxinha","Trigo+Frango+Sal", 3));
        return comidas;
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
