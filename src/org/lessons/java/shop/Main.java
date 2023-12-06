package org.lessons.java.shop;

public class Main {
    public static void main(String[] args) {
    Prodotto prodotto = new Prodotto(5, "Tv Samsung", "50 pollici UHD", 300, 22);
        System.out.println("Codice: " + prodotto.getFullName());
        System.out.println("Prezzo: " + prodotto.getPrezzoBase() + "$");
    }
}
