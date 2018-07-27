
/**
 * Escreva a descrição da classe Exercicio5 aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
import java.util.Scanner;
public class Exercicio5
{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        
        System.out.print("Informe um o valor de n: ");
        int n = in.nextInt();
        int valor = 1;
        double quadrado = 1;
        while(quadrado<n){
            System.out.println((int)quadrado);
            valor++;
            quadrado = Math.pow(valor,2);
        }
       
    }
}
