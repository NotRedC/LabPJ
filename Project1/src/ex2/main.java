package ex2;

import java.io.*;


public class main {
    public static void main(String[] args) throws IOException {
        String nume_fis_in = "src/ex2/cantec_in.txt";
        String nume_fis_out = "src/ex2/cantec_out.txt";
        BufferedReader flux_in = new BufferedReader(new FileReader(nume_fis_in));
        BufferedWriter flux_out = new BufferedWriter(new FileWriter(nume_fis_out));

        String v = flux_in.readLine();
        while (v != null) {
            Vers myVers = new Vers(v);
            String versReturnat = myVers.getVers();
            if (versReturnat.isEmpty())
            {
                flux_out.write("\n");
                v = flux_in.readLine();
                continue;
            }
            int cuvinte = myVers.returnCuvinte();
            int vocale = myVers.returnVocale();
            String grupare = "";
            double rand = Math.random();
            if(myVers.getVers().toLowerCase().endsWith("le"))
            {
                grupare = "*";
            }
            if(rand < 0.1)
            {
                versReturnat = versReturnat.toUpperCase();
            }
            flux_out.write(versReturnat + " " + cuvinte + " " + vocale + " " + grupare + "\n");
            v = flux_in.readLine();
        }
        flux_in.close();
        flux_out.close();
    }
}

