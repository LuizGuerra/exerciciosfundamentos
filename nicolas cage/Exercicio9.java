
/**
 * Escreva a descrição da classe Exercicio9 aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
import java.util.Scanner;
public class Exercicio9
{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        
        System.out.print("Informe o primeiro valor do intervalo: ");
        int valorA = in.nextInt();
        while(valorA<=0){
            System.out.println("Valor inválido.Ele deve ser positivo!");
            System.out.print("Informe novamente o primeiro valor do intervalo: ");
            valorA = in.nextInt();
        }
        
        System.out.print("Informe o segundo valor do intervalo: ");
        int valorB = in.nextInt();
        while(valorB<=0){
            System.out.println("Valor inválido.Ele deve ser positivo!");
            System.out.print("Informe novamente o segundo valor do intervalo: ");
            valorB = in.nextInt();
        }
       
        if(valorB<valorA){
            int aux = valorB;
            valorB = valorA;
            valorA = aux;
        }
        
        System.out.print("A soma dos pares entre " + valorA + " e "+
                          valorB + " é " );
                          
        if(valorA %2 !=0) valorA++;
        int soma = 0;
        while(valorA <= valorB){
            soma = soma + valorA;
            valorA = valorA + 2;
        } 
        System.out.println(soma);
    }
}
