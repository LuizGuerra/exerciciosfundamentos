import java.util.Scanner;
public class exercicio4{
    public static void main(String args[]){
        Scanner input = new Scanner (System.in);
        
        System.out.println("\fInforme um valor real de raio de uma esfera");
        double raio = input.nextDouble();
        double area = (4*Math.PI*(Math.pow(raio,2)));
        System.out.println("A área do círculo para a área dada é " + area);
        
    }
}