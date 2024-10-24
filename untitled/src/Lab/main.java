package Lab;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) throws IOException {
        List<Electronice> elc = new ArrayList<Electronice>();
        BufferedReader buf = new BufferedReader(new FileReader("src/Lab/electronice.txt"));
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String linie;
        while((linie = buf.readLine()) != null) {
            String[] arr_of_linie = linie.split(";");
            String denumire = arr_of_linie[0];
            int nr_inv = Integer.parseInt(arr_of_linie[1]);
            double pret = Double.parseDouble(arr_of_linie[2]);
            String zona_mag = arr_of_linie[3];
            Situatie sit = Situatie.valueOf(arr_of_linie[4].toUpperCase());
            switch (arr_of_linie[5].toLowerCase()) {
                case "imprimanta":
                    int ppm = Integer.parseInt(arr_of_linie[6]);
                    String rezolutie = arr_of_linie[7];
                    int p_car = Integer.parseInt(arr_of_linie[8]);
                    Tiparire tip = Tiparire.valueOf(arr_of_linie[9].toUpperCase());
                    Imprimante imprimanta = new Imprimante(denumire, nr_inv, pret, zona_mag, sit, ppm, rezolutie, p_car, tip);
                    elc.add(imprimanta);
                    break;
                case "copiator":
                    int p_ton = Integer.parseInt(arr_of_linie[6]);
                    Copiere format = Copiere.valueOf(arr_of_linie[7].toUpperCase());
                    elc.add(new Copiatoare(denumire, nr_inv, pret, zona_mag, sit, p_ton, format));
                    break;
                case "sistem de calcul":
                    String tip_mon = arr_of_linie[6];
                    double vit_proc = Double.parseDouble(arr_of_linie[7]);
                    int c_hdd = Integer.parseInt(arr_of_linie[8]);
                    Sist_Operare so = Sist_Operare.valueOf(arr_of_linie[9].toUpperCase());
                    elc.add(new Sistem_Calcul(denumire, nr_inv, pret, zona_mag, sit, tip_mon, vit_proc, c_hdd, so));
                    break;
            }
        }
        for(Electronice electronic : elc) {
            if (electronic.getDenumire() == reader.readLine()) {
                electronic.setSit(Situatie.EXPUS);
            }
        }
        afisareElectronice(elc);
        afisareImprimante(elc);
        afisareCopiatoare(elc);
        afisareSistDeCalcul(elc);
    }
    public static void afisareElectronice(List<Electronice> elc)
    {
        for(Electronice electronic : elc) {
            System.out.println(electronic.toString());
        }
    }

    public static void afisareImprimante(List<Electronice> elc)
    {
        for(Electronice electronic : elc)
        {
            if (electronic instanceof Imprimante)
            {
                System.out.println(electronic.toString());
            }
        }
    }

    public static void afisareCopiatoare(List<Electronice> elc)
    {
        for(Electronice electronic : elc)
        {
            if (electronic instanceof Copiatoare)
            {
                System.out.println(electronic.toString());
            }
        }
    }

    public static void afisareSistDeCalcul(List<Electronice> elc)
    {
        for(Electronice electronic : elc)
        {
            if (electronic instanceof Sistem_Calcul)
            {
                System.out.println(electronic.toString());
            }
        }
    }
}



enum Situatie{
    ACHIZITIONAT,
    EXPUS,
    VANDUT
}

enum Tiparire{
    COLOR,
    ALBNEGRU
}

enum Copiere{
    A3,
    A4
}

enum Sist_Operare{
    WINDOWS,
    LINUX
}

class Electronice{
    private String denumire;
    private int nr_inv;
    private double pret;
    private String zona_mag;
    private Situatie sit;

    public Electronice(String denumire, int nr_inv, double pret, String zona_mag, Situatie sit) {
        this.denumire = denumire;
        this.nr_inv = nr_inv;
        this.pret = pret;
        this.zona_mag = zona_mag;
        this.sit = sit;
    }

    @Override
    public String toString() {
        return  "denumire='" + denumire + '\'' +
                ", nr_inv=" + nr_inv +
                ", pret=" + pret +
                ", zona_mag=" + zona_mag +
                ", sit=" + sit;
    }

    public String getDenumire() {
        return denumire;
    }

    public void setSit(Situatie sit) {
        this.sit = sit;
    }
}

class Imprimante extends Electronice{
    private int ppm;
    private String rezolutie;
    private int p_car;
    private Tiparire tip;

    public Imprimante(String denumire, int nr_inv, double pret, String zona_mag, Situatie sit, int ppm, String rezolutie, int p_car, Tiparire tip) {
        super(denumire, nr_inv, pret, zona_mag, sit);
        this.ppm = ppm;
        this.rezolutie = rezolutie;
        this.p_car = p_car;
        this.tip = tip;
    }

    @Override
    public String toString() {
        return  super.toString() +
                "ppm=" + ppm +
                ", rezolutie='" + rezolutie + '\'' +
                ", p_car=" + p_car +
                ", tip=" + tip;
    }
}

class Copiatoare extends Electronice{
    private int p_ton;
    private Copiere format;

    public Copiatoare(String denumire, int nr_inv, double pret, String zona_mag, Situatie sit, int p_ton, Copiere format) {
        super(denumire, nr_inv, pret, zona_mag, sit);
        this.p_ton = p_ton;
        this.format = format;
    }

    @Override
    public String toString() {
        return super.toString() +
                "p_ton=" + p_ton +
                ", format=" + format;
    }
}

class Sistem_Calcul extends Electronice{
    private String tip_mon;
    private double vit_proc;
    private int c_hdd;
    private Sist_Operare so;

    public Sistem_Calcul(String denumire, int nr_inv, double pret, String zona_mag, Situatie sit, String tip_mon, double vit_proc, int c_hdd, Sist_Operare so) {
        super(denumire, nr_inv, pret, zona_mag, sit);
        this.tip_mon = tip_mon;
        this.vit_proc = vit_proc;
        this.c_hdd = c_hdd;
        this.so = so;
    }

    @Override
    public String toString() {
        return super.toString() +
                "tip_mon='" + tip_mon + '\'' +
                ", vit_proc=" + vit_proc +
                ", c_hdd=" + c_hdd +
                ", so=" + so;
    }
}
