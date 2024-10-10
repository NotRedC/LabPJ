package lab2;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class ex1 {
    public static void afis(String []v) {
        for(int i=0;i<v.length;i++)
            System.out.print(v[i]+" ");
        System.out.println();
    }
    public static void main(String[] args) throws IOException {
        String nume_fis = "src/lab2/judete_in.txt";
        BufferedReader flux_in = new BufferedReader(new FileReader(nume_fis));
        String []jud = new String[41];
        for (int i = 0; i < jud.length; i++)
        {
            jud[i] = flux_in.readLine();
        }
        Arrays.sort(jud);
        afis(jud);
        flux_in = new BufferedReader(new InputStreamReader(System.in));
        String poz_judet = flux_in.readLine();
        int poz=Arrays.binarySearch(jud, poz_judet);
        System.out.println(poz>=0?"Gasit pe pozitia "+poz:"Nu se gaseste!");
        flux_in.close();

    }
}
