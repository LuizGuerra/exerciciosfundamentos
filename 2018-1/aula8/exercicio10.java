import java.util.Scanner;
public class exercicio10{
    public static void main(String args[]){
        Scanner input = new Scanner (System.in);
        
        System.out.println("\fInforme o tempo do evento em segundos: ");
        int tempo = input.nextInt();
        
        int horas = (tempo/3600);
        int minutos = (tempo%60);
        int segundos = (tempo%3600%60);
        
        System.out.println("O tempo em horas é " + horas);
        System.out.println("O tempo em minutos é " + minutos);
        System.out.println("O tempo em segundos é " + segundos);
        
    }
}