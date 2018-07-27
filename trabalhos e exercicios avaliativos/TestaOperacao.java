public class TestaOperacao{
    @Test
    public void TestaCalcular(){
        assertEquals(8, Operacao.calcular(2, 3), 0);
        assertEquals(16, Operacao.calcular(2, 4), 0);
        assertEquals(1, Operacao.calcular(5, 0), 0);
        assertEquals(0.2, Operacao.calcular(5, -1), 0);
        assertEquals(6.25, Operacao.calcular(2.5, 2), 0);
    }
}