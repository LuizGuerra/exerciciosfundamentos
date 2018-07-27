import java.util.Scanner;
public class exercicio5{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        
        System.out.println("\fDigite um valor real");
        double x = input.nextDouble();
        System.out.println("O número elevado ao quadrado é " + Math.pow(x,2));
        System.out.println("O número elevado ao cubo é " + Math.pow(x,3));
        System.out.println("O número elevado à quarta potência é " + Math.pow(x,4));
    }
}