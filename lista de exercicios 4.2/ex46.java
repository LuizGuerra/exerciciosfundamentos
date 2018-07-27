import java.util.Scanner;
public class ex46{
    public static void main (String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("\fInforme um número inteiro e positivo: ");
        int valor = in.nextInt();
        while(valor<0){
            System.out.println("\fNúmero informado incorreto. Por favor, informe um número inteiro e positivo: ");
            valor = in.nextInt();
            if(valor>0){System.out.println("\fNúmero informado: " + valor);}
        }
        System.out.println("Resultado = "+soma(valor));
    }
    public static double soma(int valor){
        double numerador, denominador;
        double soma=0;
        for(int x=1; x<=valor; x++){
            numerador = x+x-1;
            if(x==1){denominador=1;}
            else{denominador=fat(numerador-1);}
            soma=soma+(numerador/denominador);
        }
        return soma;
    }
    public static double fat(double x){
        double fat = 1;
        for(double y=1; y<=x;y++){
            fat = fat*y;
        }
        return fat;
    }
}