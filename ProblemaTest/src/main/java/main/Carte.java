package main;

public class Carte extends Publicatie{
    private int numarPagini;

    public Carte(String titlu, String autor, int anPublicare, int numarPagini) {
        super(titlu, autor, anPublicare);
        this.numarPagini = numarPagini;
    }

    private int getNumarCuvinte() {
        return numarPagini * 4;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Carte{" +
                "numarPagini=" + numarPagini +
                '}'+
                "numarCuvinte=" + getNumarCuvinte();
    }
}
