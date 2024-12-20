package ex2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<Produs> produse = new ArrayList<Produs>();
        produse.add(new Produs("zahar", 1.5, 50, LocalDate.parse("2024-02-25")));
        produse.add(new Produs("zahar", 1.5, 50, LocalDate.parse("2024-02-25")));
        produse.add(new Produs("zahar", 1.5, 50, LocalDate.parse("2024-02-25")));
        afisareProduse(produse);
        afisareExpirate(produse);
        vanzareProdus(produse);
        for (Produs p:produse)
        {
            System.out.println(p.getIncasari());
        }

    }

    public static void afisareProduse(List<Produs> produse)
    {
        for(Produs p:produse)
        {
            System.out.println(p);
        }
    }

    public static void afisareExpirate(List<Produs> produse)
    {
        for(Produs p:produse)
        {
            if (p.getData_exp().compareTo(LocalDate.now()) < 1)
            {
                System.out.println(p);
            }
        }
    }

    public static void vanzareProdus(List<Produs> produse)
    {
        String produs_dorit = "zahar";
        for(Produs p: produse)
        {
            if (produs_dorit.compareTo(p.getDenumire()) == 0)
            {
                p.setCantitate(p.getCantitate() - 1);
                p.setIncasari(p.getPret());
                if(p.getCantitate() == 0)
                {
                    produse.remove(p);
                }
            }
        }
    }
}

class Produs{
    private String denumire;
    private double pret;
    private int cantitate;
    private LocalDate data_exp;
    private static double incasari;

    public Produs(String denumire, double pret, int cantitate, LocalDate data_exp) {
        this.denumire = denumire;
        this.pret = pret;
        this.cantitate = cantitate;
        this.data_exp = data_exp;
    }

    @Override
    public String toString() {
        return "(" + denumire + "," + pret + "," + cantitate + "," + data_exp + ")";
    }

    public LocalDate getData_exp() {
        return data_exp;
    }

    public String getDenumire() {
        return denumire;
    }

    public int getCantitate() {
        return cantitate;
    }

    public void setCantitate(int cantitate) {
        this.cantitate = cantitate;
    }

    public double getPret() {
        return pret;
    }

    public double getIncasari() {
        return incasari;
    }

    public void setIncasari(double incasari) {
        this.incasari += incasari;
    }
}
