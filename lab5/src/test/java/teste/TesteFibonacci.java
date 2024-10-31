package teste;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import ex3.PerecheNumere;

public class TesteFibonacci {
    @Test
    void test1_isFib()
    {
        PerecheNumere p = new PerecheNumere(5, 8);
        assertTrue(p.getFib());
    }
    @Test
    void test2_isFib()
    {
        PerecheNumere p = new PerecheNumere(8, 5);
        assertTrue(p.getFib());
    }
    @Test
    void test3_isFib()
    {
        PerecheNumere p = new PerecheNumere(5, 13);
        assertFalse(p.getFib());
    }
    @Test
    void test4_isFib()
    {
        PerecheNumere p = new PerecheNumere(5, 6);
        assertFalse(p.getFib());
    }
    @Test
    void test5_isFib()
    {
        PerecheNumere p = new PerecheNumere(1, 1);
        assertTrue(p.getFib());
    }
}
