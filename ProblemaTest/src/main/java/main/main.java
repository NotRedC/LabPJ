package main;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) throws IOException {
        List<Publicatie> publicatii = new ArrayList<Publicatie>();
        BufferedReader bufferedReader = new BufferedReader(new FileReader("src/main/resources/publicatii.csv"));
        String linie;
        while((linie = bufferedReader.readLine()) != null)
        {
            String[] split = linie.split(",");
            String tip = split[0];
            String titlu = split[1];
            String autor = split[2];
            int anPublicatie = Integer.parseInt(split[3]);
            switch (tip.toLowerCase())
            {
                case "carte":
                    int numarPagini = Integer.parseInt(split[4]);
                    Carte c = new Carte(titlu, autor, anPublicatie, numarPagini);
                    publicatii.add(c);
                    break;
                case "revista":
                    int numarExemplare = Integer.parseInt(split[4]);
                    Revista r = new Revista(titlu, autor, anPublicatie, numarExemplare);
                    publicatii.add(r);
                    break;
            }
        }
        bufferedReader.close();
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Alege optiunea: ");
        System.out.println("1. Afiseaza toate publicatiile dupa anul de publicare");
        System.out.println("2. Afiseaza cartile");
        System.out.println("3. Afiseaza revistele");
        System.out.println("4. Introdu publicatie");
        System.out.println("0. Exit");
        System.out.println("Alege optiunea: ");
        int opt = Integer.parseInt(buf.readLine());
        while(opt != 0) {
            switch (opt) {
                case 1:
                    afisarePublicatii(publicatii);
                    break;
                case 2:
                    afisareCarti(publicatii);
                    break;
                case 3:
                    afisareReviste(publicatii);
                    break;
            }
            opt = Integer.parseInt(buf.readLine());
        }
    }

    public static void afisarePublicatii(List <Publicatie> publicatii)
    {
        publicatii.stream().sorted((x,y) -> x.intCompare(x.getAnPublicare(), y.getAnPublicare())).forEach(System.out::println);
    }

    public static void afisareCarti(List <Publicatie> publicatii)
    {
        for(Publicatie p : publicatii)
        {
            if(p instanceof Carte)
            {
                System.out.println(p.toString());
            }
        }
    }

    public static void afisareReviste(List <Publicatie> publicatii)
    {
        for(Publicatie p : publicatii)
        {
            if(p instanceof Revista)
            {
                System.out.println(p.toString());
            }
        }
    }
}
