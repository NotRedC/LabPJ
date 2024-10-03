package ex3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {
    public static void main(String[] args) throws IOException {
        BufferedReader flux_in = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(flux_in.readLine());
        int prim = 0;
        System.out.println("1");
        for (int d = 2; d <= a/2; d++)
        {
            if(a % d == 0)
            {
                System.out.println(d);
                prim = 1;
            }
        }
        System.out.println(a);
        if (prim == 0)
            System.out.println("Numarul este prim");
        flux_in.close();
    }
}
