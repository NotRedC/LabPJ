package main;

public class Publicatie {
    private String titlu;
    private String autor;
    private int anPublicare;

    public Publicatie(String titlu, String autor, int anPublicare) {
        this.titlu = titlu;
        this.autor = autor;
        this.anPublicare = anPublicare;
    }

    public int intCompare(int an1, int an2) {
        if(an1 < an2)
        {
            return -1;
        } else if (an1 > an2) {
            return 1;
        }
        else
            return 0;
    }

    public String getTitlu() {
        return titlu;
    }

    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnPublicare() {
        return anPublicare;
    }

    public void setAnPublicare(int anPublicare) {
        this.anPublicare = anPublicare;
    }

    @Override
    public String toString() {
        return "Publicatie{" +
                "titlu='" + titlu + '\'' +
                ", autor='" + autor + '\'' +
                ", anPublicare=" + anPublicare +
                '}';
    }
}
