package ex4;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Persoana {
    private String nume;
    private String cnp;

    Persoana(String nume, String cnp) {
        this.nume = nume;
        this.cnp = cnp;
    }

    public int getVarsta()
    {
        int an = Character.getNumericValue(cnp.charAt(1)) + Character.getNumericValue(cnp.charAt(2));
        if(an <= 24)
        {
            an = 2000 + an;
        }
        else
        {
            an = 1900 + an;
        }
        int luna = Character.getNumericValue(cnp.charAt(3)) * 10 + Character.getNumericValue(cnp.charAt(4));
        int zi = Character.getNumericValue(cnp.charAt(5)) * 10 + Character.getNumericValue(cnp.charAt(6));
        LocalDate dataCNP = LocalDate.of(an, luna, zi);
        LocalDate dataPrezent = LocalDate.now();
        return ((int)ChronoUnit.DAYS.between(dataCNP, dataPrezent)/365);
    }

    public String getNume() {
        return nume;
    }
    public void setNume(String nume) {
        this.nume = nume;
    }
    public String getCnp() {
        return cnp;
    }
    public void setCnp(String cnp) {
        this.cnp = cnp;
    }

}
