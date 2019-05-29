package com.example.listagens;

import java.util.ArrayList;
import java.util.List;

public class Anuncio {

    private String Titulo;
    private String Descrição;
    private double Preço;
    private String Data;
    private String Bairro;

    public Anuncio(String titulo, String descrição, double preço, String data, String bairro) {
        this.Titulo = titulo;
        this.Descrição = descrição;
        this.Preço = preço;
        this.Data = data;
        this.Bairro = bairro;
    }

    public static List<Anuncio> getAnuncios(){
        List<Anuncio> anuncios=new ArrayList<>();
        anuncios.add(new Anuncio("Carro", "Usado", 2.99, "27/12", "Vila da Paz"));
        return anuncios;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getDescrição() {
        return Descrição;
    }

    public void setDescrição(String descrição) {
        Descrição = descrição;
    }

    public double getPreço() {
        return Preço;
    }

    public void setPreço(double preço) {
        Preço = preço;
    }

    public String getData() {
        return Data;
    }

    public void setData(String data) {
        Data = data;
    }

    public String getBairro() {
        return Bairro;
    }

    public void setBairro(String bairro) {
        Bairro = bairro;
    }
}
