public class Operacoes
{
    public static double fatorialRecursivo(int num){
        if(num<0) return -1;
        if(num==0 || num==1) return 1;
        //if(valor<=1) return 1;
        return num * fatorialRecursivo(num-1);
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
