import java.util.Scanner;
public class Exemplo
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        
        System.out.print("Informe um valor: ");
        int num = in.nextInt();
        
        System.out.println("N-ésimo termo de fibonacci - iterativo: " + Operacoes.fibonacciIterativo(num));
        System.out.println("N-ésimo termo de fibonacci - recursivo: " + Operacoes.fibonacciRecursivo(num));
        
        /*
        double fr = Operacoes.fatorialRecursivo(num);
        double fi = Operacoes.fatorialIterativo(num);
        
        if(fr>0) System.out.println("Fatorial iterativo: " +fi);
        else System.out.println("Erro - valor informado não é um natural");
        
        if(fi>0) System.out.println("Fatorial recursivo: " + fr);
        else System.out.println("Erro - valor informado não é um natural");*/
        
        
    }
}
