package main;

public class Revista extends Publicatie {
    private int numarExemplare;

    public Revista(String titlu, String autor, int anPublicare, int numarExemplare) {
        super(titlu, autor, anPublicare);
        this.numarExemplare = numarExemplare;
    }

    @Override
    public String toString() {
        return super.toString() +
                "numarExemplare=" + numarExemplare;
    }
}
