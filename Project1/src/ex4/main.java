package ex4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {
    public static void main(String[] args) throws IOException {
        BufferedReader flux_in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Nume: ");
        String nume = flux_in.readLine();
        System.out.println("CNP: ");
        String CNP = flux_in.readLine();
        while(!checkCifre(CNP) || !checkCifraControl(CNP) || CNP.length() != 13 || !checkPrimaCifra(CNP))
        {
            System.out.println("CNP: ");
            CNP = flux_in.readLine();
        }
        Persoana p = new Persoana(nume, CNP);
        System.out.println(p.getVarsta());
    }

    public static boolean checkCifraControl(String CNP)
    {
        String control = "279146358279";
        int sum = 0;
        for (int i = 0; i < CNP.length() - 1; i++) {
            sum = sum + (Character.getNumericValue(control.charAt(i)) * Character.getNumericValue(CNP.charAt(i)));
        }
        return sum % 11 == Character.getNumericValue(CNP.charAt(12));
    }

    public static boolean checkCifre(String CNP)
    {
        for (int i = 0; i < CNP.length() - 1; i++) {
            if(!Character.isDigit(CNP.charAt(i)))
            {
                return false;
            }
        }
        return true;
    }

    public static boolean checkPrimaCifra(String CNP)
    {
        if(Character.getNumericValue(CNP.charAt(0)) == 1 || Character.getNumericValue(CNP.charAt(0)) == 2 || Character.getNumericValue(CNP.charAt(0)) == 5 || Character.getNumericValue(CNP.charAt(0)) == 6)
            return true;
        else
            return false;
    }
}
