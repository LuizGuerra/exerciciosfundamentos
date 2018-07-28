import java.util.Scanner;
public class Ex2Main {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("\fInforme o nome do produto: ");
        String descricao = in.nextLine();
        double precoDeCusto;
        do{
            System.out.println("Informe o preço de custo do produto: ");
            precoDeCusto = in.nextDouble();
        }while(precoDeCusto<1);
        int estoque;
        do{
            System.out.println("Informe o estoque do produto: ");
            estoque = in.nextInt();
        }while(estoque<0);
        
        Produto produto1 = new Produto();
        produto1.descricao = descricao;
        produto1.precoDeCusto = precoDeCusto; 
        produto1.estoque = estoque;
        
        System.out.println("");
        System.out.println("Dados do Produto:");
        System.out.println("Nome: "+produto1.getDescricao());
        System.out.println("Quantidade em estoque: "+produto1.getEstoque());
        System.out.println("Preço de custo: "+produto1.getPrecoDeCusto());
        
        produto1.setPrecoDeCusto(produto1.getPrecoDeCusto()+1);
        
        System.out.println("");
        int add;
        do{
            System.out.println("Deseja acrescentar estoque? Se sim, informe um valor, se não, digite 0 (zero): ");
            add = in.nextInt();
        } while(add<0);
        produto1.acrescentaEstoque(add);
        System.out.println("Total em estoque: "+produto1.getEstoque());
        System.out.println("");
        int less;
        do{
            System.out.println("Deseja retirar estoque? Se sim, informe um valor, se não, digite 0 (zero): ");
            less = in.nextInt();
        } while(less<0);
        produto1.retiraEstoque(less);
        
        if(produto1.getEstoque()<0){System.out.println("Erro! Tirou mais do estoque do que possuía.");}
        else{System.out.println("Total em estoque: "+produto1.getEstoque());}
        
        System.out.println("");
        System.out.println("Preço de venda: "+produto1.calcularPreco());        
        System.out.println("Dados do Produto:");
        System.out.println("Nome: "+produto1.getDescricao());
        System.out.println("Quantidade em estoque: "+produto1.getEstoque());
        System.out.println("Preço de custo: "+produto1.getPrecoDeCusto());
    }
}