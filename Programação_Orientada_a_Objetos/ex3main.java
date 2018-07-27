// Implemente um método de classe recusivo que indica quantos espaços em branco uma String qualquer possui.
import java.util.Scanner;
public class ex3main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("\fInforme uma string: ");
        String frase = in.nextLine();
        System.out.println("Recursão: O número de espaços na string dada é: "+recursivo(frase, frase.length()-1));
        System.out.println("Recursão com método separado: O número de espaços na string dada é: "+
                            ex3.recursivo(frase, frase.length()-1));
    }
    public static int recursivo(String frase, int x){
        int y = 0;
        String str;
        if(x==0){
            str = frase.substring(0,1);
            if(str.equals(" ")){y++;}
            return y;
        }
        str = frase.substring(x,x+1);
        if(str.equals(" ")){y++;}
        y=y+recursivo(frase, x-1);
        return y;
    }
}