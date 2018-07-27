import java.util.Scanner;
public class exerc4{
    public static void main(String args[]){
        Scanner input = new Scanner (System.in);
        System.out.println("\fDigite um número: ");
        double x = input.nextDouble();
        if(x==0) System.out.println("Valor é igual a zero.");
        else if(x<0 && x>(-1))System.out.println("Valor é negativo e pequeno.");
        else if(x<0 && x<=(-1000))System.out.println("Valor é negativo e grande.");
        else if(x<0 && 1000>x && x<(-1))System.out.println("Valor é negativo.");
        else if(x>0 && x<1)System.out.println("Valor é positivo e pequeno.");
        else if(x>0 && x>1000)System.out.println("Valor é positivo e grande.");
        else if(x>0 && 1000>x || x<1)System.out.println("Valor é positivo.");}}