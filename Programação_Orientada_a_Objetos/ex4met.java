public class ex4met{
    public static double equacao(int num){
        double numerador, denominador;
        double soma = 0;
        for(int x = 1; x<=num; x++){
            numerador=x+(x-1);
            if(x==1){denominador = 1;}
            else{
                double batata = numerador-1;
                denominador=fatorial(batata);
            }
            soma=soma+(numerador/denominador);
        }
        return soma;
    }
    public static double fatorial(double den){
        double soma=0;
        if(den==1){return 1;}
        soma = den*fatorial(den-1);
        return soma;
    }
}