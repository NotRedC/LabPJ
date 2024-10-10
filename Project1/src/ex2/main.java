package ex2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class main {
    public static void main(String[] args) throws IOException {
        String nume_fis = "src/ex2/cantec_in.txt";
        BufferedReader flux_in = new BufferedReader(new FileReader(nume_fis));
        Vers myVers = new Vers();

        String test = flux_in.readLine();
        String []arr_of_test = test.split(" ");

        myVers.setVers(arr_of_test);
        System.out.println(myVers.returnVocale());

    }
}

class Vers{
    private String []vers;
    public int returnCuvinte(){
        return vers.length;
    }

    public int returnVocale()
    {
        String voc = "aeiouAEIOU";
        int nr_voc = 0;
        for (int i = 0; i < vers.length; i++)
        {
            for (int j = 0; j < voc.length(); j++) {
                if (vers[i].) {
                    nr_voc++;
                }
            }
        }
        return nr_voc;
    }

    public String[] getVers() {
        return vers;
    }

    public void setVers(String[] vers) {
        this.vers = vers;
    }
}
