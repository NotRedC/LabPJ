package ex4;

import java.util.Random;

public class main {
    public static void main(String[] args) {
        Random rand = new Random();
        int rand_int1 = rand.nextInt(31);
        System.out.println(rand_int1);
        int rand_int2 = rand.nextInt(31);
        System.out.println(rand_int2);
        System.out.println("GCD = " + cmmdc(rand_int1, rand_int2));
    }
    static int cmmdc(int a, int b)
    {
        int i;
        if (a < b)
            i = a;
        else
            i = b;

        for (i = i; i > 1; i--) {
            if (a % i == 0 && b % i == 0)
                return i;
        }
        return 1;
    }
}
