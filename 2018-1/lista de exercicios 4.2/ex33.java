/* 33. Faça um programa que leia uma string e a escreva sem as vogais.
 Crie um método que recebe a string como parâmetro e a devolve sem as vogais */
import java.util.Scanner;
public class ex33{
    public static void main (String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("\fDiga uma frase: ");
        String frase = in.nextLine();
        System.out.println("A frase dada sem vogais é: "+svogais(frase));
    }
    public static String svogais(String frase){
        String sem = "";
        for(int x = 0; x<frase.length(); x++){
            if(
            frase.charAt(x) != 'a' && frase.charAt(x) != 'A' &&
            frase.charAt(x) != 'e' && frase.charAt(x) != 'E' &&
            frase.charAt(x) != 'i' && frase.charAt(x) != 'I' &&
            frase.charAt(x) != 'o' && frase.charAt(x) != 'O' &&
            frase.charAt(x) != 'u' && frase.charAt(x) != 'U' ){
                sem = sem + frase.charAt(x);
            }
        }
        return sem;
    }
}