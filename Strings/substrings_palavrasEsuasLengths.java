  /** Faça um programa que leia um arquivo texto qualquer e gera um outro arquivo com as
strings do primeiro ao contrário. Para inverter as strings, crie um método estático capaz de
inverter uma string de cada vez. */
import java.util.Scanner;
public class substrings_palavrasEsuasLengths{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("\fInforme uma frase: ");
        String frase = in.nextLine();
        System.out.println("Tamanho total da Frase: " +frase.length());
        String[] strList = frase.split(" ");
        for (int x = 0; x<= strList.length-1; x++){
            System.out.println("Palavra: '"+strList[x]+"', Letras: " + strList[x].length());
        }
        //System.out.println("");
         
        
        
    }
}