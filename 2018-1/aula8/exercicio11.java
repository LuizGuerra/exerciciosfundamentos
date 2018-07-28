import java.util.Scanner;
public class exercicio11
{
    public static void main(String args[]){
        Scanner input = new Scanner (System.in);
        
        System.out.println("\fDigite um valor inteiro de 4 dígitos: ");
        int valor = input.nextInt();
        
        int m = valor/1000;
        valor = valor % 1000;
        int c = valor/100;
        valor = valor % 100;
        int d = valor/10;
        int u = valor%10;
        
        int isso = (u*1000)+(d*100)+(c*10)+(m);
        System.out.println("Valor ao contrário: " + isso);
        
        
    }
}