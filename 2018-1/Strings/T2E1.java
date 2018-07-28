import java.util.Scanner;
public class T2E1{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("\fInforme um número inteiro e positivo: ");
        int valor = in.nextInt();
        while(valor<=0){
            System.out.println("");
            System.out.println("Número incorreto. Informe um número inteiro e positivo: ");
            valor=in.nextInt();
        }
        System.out.println("Resultado com recursão: " + recursividade(valor));
        System.out.println("Resultado com iteratividade: " + iteratividade(valor));
    } 
    public static double iteratividade(int valor){
        int x;
        double soma=0, numerador, denominador;
        for(x=1; x<=valor; x++){
            numerador = 1+(2*x);
            denominador = x*x;
            soma=soma+(numerador/denominador);
        }
        return soma;
    }
    public static double recursividade(int num){
        if(num==1){
            return 3; 
        }
        
        double calculo;
        double soma=0, numerador, denominador;
        
        numerador=1+(2*num);
        denominador = num*num;
        calculo=numerador/denominador;
        
        soma=soma+calculo+recursividade(num-1);
        
        return soma;
    }
}
