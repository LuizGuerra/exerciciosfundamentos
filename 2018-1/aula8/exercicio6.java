import java.util.Scanner;
public class exercicio6{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        
        System.out.println("\fDigite a largura do terreno ");
        double valor11 = input.nextDouble();
        
        System.out.println("Digite o comprimento do terreno ");
        double valor12 = input.nextDouble();
        
        System.out.println("\fDigite a largura da casa ");
        double valor21 = input.nextDouble();
        
        System.out.println("Digite o comprimento da casa ");
        double valor22 = input.nextDouble();
        
        double area1 = (valor11*valor12);
        double area2 = (valor21*valor22);
        double sobra = (area1-area2);
        
        if (area1>=area2) System.out.println("A área restante é de: " + sobra);
        else System.out.println("\fValores impossíveis.");
    }
}