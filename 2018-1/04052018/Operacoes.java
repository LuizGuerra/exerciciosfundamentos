
/**
 * Escreva a descrição da classe Operacoes aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Operacoes
{
    public static double fatorialRecursivo(int valor){
        if(valor<0) return -1;
        if(valor==0 || valor==1) return 1;
        //if(valor<=1) return 1;
        return valor * fatorialRecursivo(valor-1);
    }
    
    public static double fatorialIterativo(int valor){
        if(valor<0) return -1;
        double f=1;
        for(int i=2; i<=valor; i++){
            f = f * i;
        }
        return f;
    }
    
    public static int fibonacciRecursivo(int n){
        if(n==1 || n==2) return 1;
        return fibonacciRecursivo(n-1) + fibonacciRecursivo(n-2);
    }
    
    public static long fibonacciIterativo(int n){
        if(n==1 || n==2) return 1;
        long t1 = 1;
        long t2 = 1;
        long soma=0;
        for(int cont = 3; cont<=n ; cont++){
            soma = t1 + t2;
            t1 = t2;
            t2 = soma;
        }
        return soma;
    }
}
