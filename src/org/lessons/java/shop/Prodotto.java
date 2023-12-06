package org.lessons.java.shop;

public class Prodotto {

    //Attributi
    private int codice;
    private String nome;
    private String descrizione;
    private int prezzoBase;
    private double iva;

    //Costruttori


    public Prodotto(int codice, String nome, String descrizione, int prezzoBase, double iva) {
        this.codice = codice;
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzoBase = prezzoBase;
        this.iva = iva;
    }

    //Getter e Setter


    public int getCodice() {
        return codice;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public int getPrezzoBase() {
        return prezzoBase;
    }

    public void setPrezzoBase(int prezzoBase) {
        this.prezzoBase = prezzoBase;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    //Metodo per mostrare il prodotto
    public String getFullName() {
        return codice + "#, " + nome;
    }

    public double getFullPrice() {
        return prezzoBase + (prezzoBase * iva);}
}



