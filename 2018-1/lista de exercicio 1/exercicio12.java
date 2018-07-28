import java.util.Scanner;
public class exercicio12{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        
        System.out.println("\fInforme um valor inteiro de dinheiro para retirar: ");
        int valor = input.nextInt();
        
        System.out.println((valor/100) + " notas de 100");
        valor = (valor%100);
        System.out.println((valor/50) + " notas de 50");
        valor = (valor%50);
        System.out.println((valor/20) + " notas de 20");
        valor = (valor%20);
        System.out.println((valor/10) + " notas de 10");
        valor = valor%10;
        System.out.println((valor/5) + " notas de 5");
        valor = valor%5;
        System.out.println((valor/2) + " notas de 2");
        valor = valor/2;
        System.out.println((valor%2) + " moedas de 1");

        
    }
}