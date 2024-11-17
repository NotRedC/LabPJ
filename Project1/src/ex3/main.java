package ex3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {
    public static void main(String[] args) throws IOException {
        BufferedReader flux_in = new BufferedReader(new InputStreamReader(System.in));
        String sir = flux_in.readLine();
        StringBuilder builder = new StringBuilder(sir);
        builder.insert(3, flux_in.readLine());
        System.out.println(builder);
        builder.delete(2,builder.length()-1);
        System.out.println(builder);
    }
}
