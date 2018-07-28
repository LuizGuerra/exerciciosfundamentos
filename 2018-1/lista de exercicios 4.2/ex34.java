/** Faça um programa que leia uma string e a escreva na ordem inversa.
 * Crie um método que recebe a string como parâmetro e a devolve invertida. */
import java.util.Scanner;
public class ex34{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("\fDiga uma frase: ");
        String frase = in.nextLine();
        System.out.println("A frase ao contrário é: "+inverso(frase));
    }
    public static String inverso(String frase){
        String back = "";
        for(int x = frase.length()-1; x>=0; x--){
            back = back + frase.charAt(x);
        }
        return back;
    }
}