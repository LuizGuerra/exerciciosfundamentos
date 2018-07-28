import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
public class TestaCalculos{
    public TestaCalculos()
    {
    }
    @Before
    public void setUp()
    {
    }
    @After
    public void tearDown()
    {
    }
    @Test
    public void testaSomaS()
    {
        assertEquals(1, Calculos.calculaS(1, 1), 0.1);
        assertEquals(0, Calculos.calculaS(-2, 1), 0.1);
        assertEquals(1.5333, Calculos.calculaS(3, 1), 0.1);
        assertEquals(933352.0104, Calculos.calculaS(10, 2.5), 0.1);
        assertEquals(7.237, Calculos.calculaS(5, 1.5), 0.1);
    }

    @Test
    public void testaSomatorioR()
    {
        assertEquals(0, Calculos.somatorioR(-9));
        assertEquals(3, Calculos.somatorioR(2));
        assertEquals(15, Calculos.somatorioR(5));
        assertEquals(210, Calculos.somatorioR(20));
        assertEquals(210, Calculos.somatorioR(20));
        assertEquals(45150, Calculos.somatorioR(300));
        assertEquals(500500, Calculos.somatorioR(1000));
    }

    @Test
    public void testaGemeos()
    {
        assertEquals(true, Calculos.gemeos(3, 5));
        assertEquals(false, Calculos.gemeos(0, 2));
        assertEquals(false, Calculos.gemeos(111, 113));
        assertEquals(true, Calculos.gemeos(17, 19));
        assertEquals(false, Calculos.gemeos(21, 23));
        assertEquals(false, Calculos.gemeos(31, 33));
        assertEquals(true, Calculos.gemeos(191, 193));
        assertEquals(false, Calculos.gemeos(201, 203));
        assertEquals(false, Calculos.gemeos(1001, 1002));
        assertEquals(false, Calculos.gemeos(1001, 1003));
        assertEquals(false, Calculos.gemeos(1011, 1013));
        assertEquals(false, Calculos.gemeos(91, 93));
    }
}


