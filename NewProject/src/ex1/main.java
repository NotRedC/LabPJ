package ex1;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a=");
        int a = scanner.nextInt();
        System.out.println("Valoarea: " + a);
        scanner.close();
    }
}
