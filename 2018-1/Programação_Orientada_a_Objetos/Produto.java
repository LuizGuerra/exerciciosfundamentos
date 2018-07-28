public class Produto{
    String descricao;
    double precoDeCusto;
    int estoque=0;
    public double getPrecoDeCusto(){
        return precoDeCusto;
    }
    public void setPrecoDeCusto(double preco){
    
    }
    public int acrescentaEstoque(int x){
        estoque = estoque + x;
        return estoque;
    }
    public double retiraEstoque(int x){
        estoque = estoque-x;
        return estoque;
    }
    public int getEstoque(){
        return estoque;
    }
    public String getDescricao(){
        return descricao;
    }
    public double calcularPreco(){
        if(precoDeCusto<10){return precoDeCusto*10/3;}
        else if(precoDeCusto<30){return precoDeCusto*10/5;}
        else if(precoDeCusto<50){return precoDeCusto*10/6;}
        return precoDeCusto*10/7;
    }
}