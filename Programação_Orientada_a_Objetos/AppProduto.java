public class AppProduto {
    public static void main(String args[]){
        System.out.print("\f");
        
        String descricao;
        double precoDeCusto;
        int estoque=0;
        
        Produto produto1 = new Produto();
        produto1.descricao = "Chocolate 200g";
        produto1.precoDeCusto = 2.70; 
        produto1.estoque = 300;
        
        produto1.setPrecoDeCusto(produto1.getPrecoDeCusto()+1);
        produto1.acrescentaEstoque(estoque);
        System.out.println("Dados do Produto: " + produto1.getDescricao());
        produto1.retiraEstoque(50);
        if(produto1.getEstoque()<0){System.out.println("Erro! Tirou mais do estoque do que possuía.");}
        else{System.out.println("Total em estoque: "+produto1.getEstoque());}
        System.out.println("Preço de venda: "+produto1.calcularPreco());
    }
}