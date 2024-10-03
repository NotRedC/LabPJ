package ex2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws IOException {
        String nume_fis = "src/ex2/in.txt";
        BufferedReader flux_in;
        flux_in = new BufferedReader(new FileReader(nume_fis));
        String linie = flux_in.readLine();
        int suma = 0;
        int contor = 0;
        int x = Integer.parseInt(linie);
        int val_min = x;
        int val_max = x;
        while (linie != null)
        {
            x = Integer.parseInt(linie);
            if(x > val_max)
                val_max = x;
            if(x < val_min)
                val_min = x;
            suma += x;
            contor++;
            linie = flux_in.readLine();
        }
        float medie = (float) suma / contor;
        System.out.println("Suma = " + suma);
        System.out.println("medie = " + medie);
        System.out.println("Valoare minima = " + val_min);
        System.out.println("Valoare maxima = " + val_max);
        flux_in.close();
    }
}
