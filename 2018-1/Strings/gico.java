import java.util.Scanner;
public class gico{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("\fInforme um número");
        int valor = in.nextInt();
        String somaR = "";
        int x;
        double soma=0, numerador, denominador;
        for(x=1; x<=valor; x++){
            numerador = 1+(2*x);
            denominador = x*x;
            soma=soma+(numerador/denominador);
            somaR=(int)numerador + "/"+(int)denominador;
            // string + int out in put 65 gervázio hacker
            System.out.println(somaR);
        }
        System.out.println("Resultado: " + soma);
    }
}