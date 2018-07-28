import java.util.Scanner;
public class Exercicio22{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.print("\fInforme um valor inteiro (R$) entre 1 e 9999: ");
        int valor = in.nextInt();
        if(valor<1 || valor>9999) System.out.println("ERRO: O valor deve estar em [1;9999]");
        else{
            int milhar = valor/1000;
            int resto = valor % 1000;
            switch(milhar){
                case 2: System.out.print("dois mil "); break;
                case 3: System.out.print("três mil "); break;
                case 9: System.out.print("nove mil "); break;
            }
            int centena = resto/100;
            resto = resto %100;
            switch(centena){
                case 2: System.out.print("duzentos "); break;
                case 3: System.out.print("trezentos "); break;
                case 9: System.out.print("novecentos "); break;
            }
            
            int dezena = resto/10;
            int unidade = resto %10;
            switch(dezena){
                case 2: System.out.print("vinte "); break;
                case 9: System.out.print("noventa "); break;
                case 3: System.out.print("trinta "); break;
            }
            
            switch(unidade){
                case 2: System.out.print("dois"); break;
                case 3: System.out.print("três"); break;
                case 9: System.out.print("nove"); break;
            }
        }
    }
}