import java.util.Scanner;
public class negativo{
    public static void main(String args[]){
        Scanner input = new Scanner (System.in);
        System.out.println("\fDigite um número: ");
        double x = input.nextDouble();
        if(x<0) System.out.println("Negativo");
        else System.out.println("else");
    }}