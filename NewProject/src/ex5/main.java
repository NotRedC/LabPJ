package ex5;

import java.util.Random;

public class main {
    public static void main(String[] args) {
        Random rand = new Random();
        int rand_int = rand.nextInt(21);
        System.out.println(isFibonacci(rand_int) ? rand_int + " face parte din sirul lui Fibonacci" : rand_int + " nu face parte din sirul lui Fibonacci");

    }

    static boolean isPerfectSquare(int x)
    {
        int s = (int) Math.sqrt(x);
        return (s*s == x);
    }

    static boolean isFibonacci(int n)
    {
        return isPerfectSquare(5*n*n + 4) || isPerfectSquare(5*n*n - 4);
    }
}
