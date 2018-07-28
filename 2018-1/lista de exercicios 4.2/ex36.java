/** Faça um programa que leia uma string e verique se ela é palíndrome.
 * Palíndrome são aquelas palavras podem ser lidas tanto da esquerda para 
 * direita ou da direita para esquerda.
 * Exemplo: arara. Crie um método para verifcar se a string é palíndrome */
import java.util.Scanner;
public class ex36{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Diga uma frase ou palavra: ");
        String frase = in.nextLine();
        System.out.println("A string "+pal(frase));
    }
    public static String pal(String frase){
        String teste="";
        for(int x = frase.length()-1; x>=0; x--){
            teste+=frase.charAt(x);
        }
        if(teste.equals(frase)){return "é palíndrome.";}
        return "não é palíndrome";
    }
}