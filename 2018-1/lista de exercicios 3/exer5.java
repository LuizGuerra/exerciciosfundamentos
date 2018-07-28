import java.util.Scanner;
public class exer5{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("\fEscreva qualquer número inteiro: ");
        int n = input.nextInt();
        
        System.out.println(quadrado(n));
    }
    public static double quadrado(int n){
        int valor = 1;
        double quadrado=1;
        while(quadrado<=n){
            valor++;
            quadrado=Math.pow(valor,2);
        }
        return quadrado;
    }
}