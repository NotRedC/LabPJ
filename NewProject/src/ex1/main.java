package ex1;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a=");
        int a = scanner.nextInt();
        System.out.print("b=");
        int b = scanner.nextInt();
        int perimetru = 2 * a + 2 * b;
        int aria = a * b;
        System.out.println("Perimetru= " + perimetru);
        System.out.println("Aria = " + aria);
        scanner.close();
    }
}
