package Singleton_SAB;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TrianguloTest {

    @Before
    public void resetSingleton() {
        Triangulo.resetarSingletons();
    }

    @Test
    public void testTrianguloInvalido() {
        try {
            Triangulo.criarEscaleno(1, 1, 20);
            fail("Deveria lançar MedidaInvalidaException");
        } catch (MedidaInvalidaException e) {
            assertTrue(true);
        }
    }

    @Test
    public void testSingletonEquilatero() {
        Triangulo t1 = Triangulo.criarEquilatero(6);
        Triangulo t2 = Triangulo.criarEquilatero(6);
        assertSame(t1, t2);
    }

    @Test
    public void testSingletonIsosceles() {
        Triangulo t1 = Triangulo.criarIsosceles(5, 3);
        Triangulo t2 = Triangulo.criarIsosceles(5, 3);
        assertSame(t1, t2);
    }

    @Test
    public void testSingletonEscaleno() {
        Triangulo t1 = Triangulo.criarEscaleno(5, 6, 7);
        Triangulo t2 = Triangulo.criarEscaleno(5, 6, 7);
        assertSame(t1, t2);
    }

    @Test
    public void testAreaPerimetro() {
        Triangulo t = Triangulo.criarEquilatero(6);
        assertEquals(18.0, t.obterPerimetro(), 0.001);
        assertEquals(15.59, t.obterArea(), 0.1);
    }
}
