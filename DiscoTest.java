package Singleton_SAB;

import org.junit.Test;
import static org.junit.Assert.*;

public class DiscoTest {

    @Test
    public void testSingletonDisco() {
        Disco d1 = Disco.getInstancia(5);
        Disco d2 = Disco.getInstancia(5);
        assertSame(d1, d2);
    }

    @Test(expected = MedidaInvalidaException.class)
    public void testRaioInvalido() {
        Disco.getInstancia(-2);
    }

    @Test
    public void testAreaPerimetro() {
        Disco d = Disco.getInstancia(3);
        d.ajustarRaio(3);
        assertEquals(28.27, d.obterArea(), 0.01);
        assertEquals(18.85, d.obterPerimetro(), 0.01);
    }
}