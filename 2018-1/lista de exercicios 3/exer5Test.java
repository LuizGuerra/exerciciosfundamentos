

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * A classe de teste exer5Test.
 *
 * @author  (seu nome)
 * @version (um número de versão ou data)
 */
public class exer5Test
{
    /**
     * Construtor default para a classe de teste exer5Test
     */
    public exer5Test()
    {
    }

    /**
     * Define a .
     *
     * Chamado antes de cada método de caso de teste.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Chamado após cada método de teste de caso.
     */
    @After
    public void tearDown()
    {
    }

    @Test
     public void testaSomaS()
    {
        assertEquals(4, exer5.quadrado(2), 0.1);
        assertEquals(16, exer5.quadrado(4), 0.1);
    }
}

