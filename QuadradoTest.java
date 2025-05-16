package Singleton_SAB;

import org.junit.Test;
import static org.junit.Assert.*;

public class QuadradoTest {

    @Test
    public void testQuadradoValido() {
        Quadrado q = new Quadrado(4);
        assertEquals(4.0, q.getLado(), 0.001);
    }

    @Test(expected = MedidaInvalidaException.class)
    public void testQuadradoInvalido() {
        new Quadrado(0);
    }

    @Test
    public void testAreaPerimetro() {
        Quadrado q = new Quadrado(5);
        assertEquals(25.0, q.obterArea(), 0.001);
        assertEquals(20.0, q.obterPerimetro(), 0.001);
    }
}